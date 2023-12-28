const indexController = require("./controllers/index.controller");
const router = require('express').Router()

router.get('/', indexController.index)
router.get('/api/hotel', indexController.hotel)
router.get('/api/wisata', indexController.wisata)
router.get('/api/wisata/:id', indexController.getWisataById)
router.get('/api/hotel/:id', indexController.getHotelById)

module.exports = router;

