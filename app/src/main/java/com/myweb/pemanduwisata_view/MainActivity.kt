package com.myweb.pemanduwisata_view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val cvDestinasi= findViewById<Button>(R.id.cvDestinasi)
        cvDestinasi.setOnClickListener {
            openMapActivity()
        }
    }

    private fun openMapActivity() {
        val intent = Intent(this@MainActivity, MainActivityMap::class.java)
        startActivity(intent)
    }
}