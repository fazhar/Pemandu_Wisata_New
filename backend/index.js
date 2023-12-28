const express = require('express')
const bodyParser = require('body-parser')
const config = require('./config')
const db = require('./database')

const app = express()
const routes = require('./routes');
app.use(bodyParser.json())
app.use(
	bodyParser.urlencoded({
		extended: false
	})
)

db.authenticate()
	.then(() => console.log('[DB] Connection has been established successfully.'))
	.catch(error => console.error('[DB] Unable to connect to the database:', error))

db.sync({
	alter: true
})
	.then(() => console.log('[DB] Database synced successfully.'))
	.catch(error => console.error('[DB] Error:', error))

app.use('/', routes)

app.listen(config.port, () => {
	console.log('Server is running on port ' + config.port)
	console.log('Visit http://localhost:' + config.port + '/')
})
