const express = require('express')
const app = express()

// panggil routers member
const member = require('./routers/member')
const paket = require('./routers/paket')
const users = require('./routers/users')
const transaksi = require("./routers/transaksi")
const { login } = require('./routers/login')


app.use('/api/member', member)
app.use('/api/paket', paket)
app.use('/api/users',users)
app.use('/api/transaksi', transaksi)
app.use('/api/auth', login)


app.listen(8000,() => {
    console.log('server run on port 8000');
})