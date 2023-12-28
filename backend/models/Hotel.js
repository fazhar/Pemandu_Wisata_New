const {DataTypes} = require('sequelize')
const db = require('../database')

const Hotel = db.define('Hotel', {
	id: {
		type: DataTypes.INTEGER,
		autoIncrement: true,
		primaryKey: true
	},
	date: DataTypes.DATE,
	kode_provinsi: DataTypes.INTEGER(10),
	nama_provinsi: DataTypes.STRING(100),
	bps_kode_kabupaten_kota: DataTypes.INTEGER(10),
	bps_nama_kabupaten_kota: DataTypes.STRING(100),
	nama_hotel: DataTypes.STRING(100),
	banyak_kamar: DataTypes.INTEGER(5),
	hotel_berbintang: DataTypes.BOOLEAN,
	ket: DataTypes.TEXT,
	tahun: DataTypes.INTEGER(5)
})

module.exports = Hotel
