const {hotel, wisata} = require('../assets/datasets.json')
const Hotel = require('../models/Hotel')
const {Sequelize} = require('sequelize')
const db = require('../database')
const Wisata = require('../models/Wisata')

const responseTemplate = (data, message, total) => {
	return {
		message: message,
		total: total,
		data: data,
	}
}

module.exports = {
	index: async (req, res) => {
		return res.json('{}')
	},
	hotel: async (req, res) => {
		const searchTerm = req.query.search || ''
		db.query(
			`SELECT * FROM \`Hotels\` WHERE nama_hotel LIKE '%${searchTerm}%' OR \`bps_nama_kabupaten_kota\` LIKE '%${searchTerm}%'`
		)
			.then(([hotels]) => {
				return res.status(200).json(hotels, null, hotels.length)
			})
			.catch(err => {
				return res.status(500).json({error: err.message})
			})
	},
	wisata: async (req, res) => {
		const searchTerm = req.query.search || ''
		db.query(
			`SELECT * FROM \`Wisata\` WHERE bps_nama_kabupaten_kota LIKE '%${searchTerm}%' OR \`alam\` LIKE '%${searchTerm}%' OR \`buatan\` LIKE '%${searchTerm}%' OR \`budaya\` LIKE '%${searchTerm}%'`
		)
			.then(([wisata]) => {
				const response = responseTemplate(wisata, null, wisata.length)
				return res.status(200).json(response)
			})
			.catch(err => {
				const response = responseTemplate(null, err.message)
				return res.status(500).json(response)
			})
	},
	getWisataById: async (req, res) => {
		const id = req.params.id 
		db.query(
			`SELECT * FROM \`Wisata\` WHERE id=${id}`
		)
			.then(([wisata]) => {
				const response = responseTemplate(wisata[0], null, wisata.length)
				return res.status(200).json(response)
			})
			.catch(err => {
				const response = responseTemplate(null, err.message)
				return res.status(500).json(response)
			})
	},
	getHotelById: async (req, res) => {
		const id = req.params.id 
		db.query(
			`SELECT * FROM \`hotels\` WHERE id=${id}`
		)
			.then(([hotels]) => {
				const response = responseTemplate(hotels[0], null, hotels.length)
				return res.status(200).json(response)
			})
			.catch(err => {
				const response = responseTemplate(null, err.message)
				return res.status(500).json(response)
			})
	}
}
