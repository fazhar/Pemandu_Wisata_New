const {DataTypes} = require('sequelize')
const db = require('../database')

const Wisata = db.define('Wisata', {
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
	alam: DataTypes.STRING(100),
	budaya: DataTypes.STRING(100),
	buatan: DataTypes.STRING(100),
	tahun: DataTypes.INTEGER(5)
})

module.exports = Wisata
