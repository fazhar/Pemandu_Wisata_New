package com.myweb.pemanduwisata_view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myweb.pemanduwisata_view.modelmap.nearby.ModelResults
import com.myweb.pemanduwisata_view.databinding.ListItemLocationBinding




class MainAdapterMap(private val context: Context) : RecyclerView.Adapter<MainAdapterMap.MainViewHolder>() {

    private val modelResultArrayList = ArrayList<ModelResults>()

    fun setLocationAdapter(items: ArrayList<ModelResults>) {
        modelResultArrayList.clear()
        modelResultArrayList.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_location, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val modelResult = modelResultArrayList[position]

        //set rating
        val newValue = modelResult.rating.toDouble()
        holder.ratingBar.numStars = 5
        holder.ratingBar.stepSize = 0.5.toDouble().toFloat()
        holder.ratingBar.rating = newValue.toFloat()
        holder.tvNamaJalan.text = modelResult.vicinity
        holder.tvNamaLokasi.text = modelResult.name
        holder.tvRating.text = "(" + modelResult.rating + ")"

        //set data to share & intent
        val strPlaceId = modelResultArrayList[position].placeId
        val strNamaLokasi = modelResultArrayList[position].name
        val strNamaJalan = modelResultArrayList[position].vicinity
        val strLat = modelResultArrayList[position].modelGeometry.modelLocation.lat
        val strLong = modelResultArrayList[position].modelGeometry.modelLocation.lng

        //send data to another activity
        holder.linearRute.setOnClickListener {
            val intent = Intent(context, RuteActivity::class.java)
            intent.putExtra("placeId", strPlaceId)
            intent.putExtra("vicinity", strNamaJalan)
            intent.putExtra("lat", strLat)
            intent.putExtra("lng", strLong)
            context.startActivity(intent)
        }

        //intent to share location
        holder.imageShare.setOnClickListener {
            val strUri = "http://maps.google.com/maps?saddr=$strLat,$strLong"
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, strNamaLokasi)
            intent.putExtra(Intent.EXTRA_TEXT, strUri)
            context.startActivity(Intent.createChooser(intent, "Bagikan :"))
        }
    }

    override fun getItemCount(): Int {
        return modelResultArrayList.size
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var linearRute: LinearLayout
        var tvNamaJalan: TextView
        var tvNamaLokasi: TextView
        var tvRating: TextView
        var imageShare: ImageView
        var ratingBar: RatingBar

        init {
            linearRute = itemView.findViewById(R.id.linearRute)  // Ganti dengan ID yang sesuai
            tvNamaJalan = itemView.findViewById(R.id.tvNamaJalan)  // Ganti dengan ID yang sesuai
            tvNamaLokasi = itemView.findViewById(R.id.tvNamaLokasi)  // Ganti dengan ID yang sesuai
            tvRating = itemView.findViewById(R.id.tvRating)  // Ganti dengan ID yang sesuai
            imageShare = itemView.findViewById(R.id.imageShare)  // Ganti dengan ID yang sesuai
            ratingBar = itemView.findViewById(R.id.ratingBar)  // Ganti dengan ID yang sesuai
        }
    }

}