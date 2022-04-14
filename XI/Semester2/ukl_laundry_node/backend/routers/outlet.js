const { request, response } = require('express')
const express = require('express') // buat library express

const app = express() 

// Accept request body tipe json
app.use(express.json())


const models = require("../models/index")
const outlet = models.outlet
const {auth} = require("./login")

// Middleware Auth
// app.use(auth) 

// get all outlet
app.get('/', async (request, response) => {
    let dataOutlet = await outlet.findAll()
    return response.json(dataOutlet)
})

// add new outlet
app.post('/', (request, response) => {
    let newOutlet = {
        nama: request.body.nama,
        alamat: request.body.alamat,        
        telepon: request.body.telepon
    }

    outlet.create(newOutlet) // create berisi objek
    .then(result => {
        response.json({
            message: 'Data berhasil ditambahkan'
        })
    })
    .catch(error => {
        return response.json({
            message: error.message
        })
    })
})

// update data
app.put("/:id_outlet", (request, response) => {
    // tampung data yang akan diubah,object data
    let data = {
        nama: request.body.nama,
        alamat: request.body.alamat,
        telepon: request.body.telepon
    }

    let parameter = {
        id_outlet: request.params.id_outlet
    }

    // proses update
    outlet.update(data, {where: parameter})
    .then(result => {
       return response.json({
            message: `Data berhasil diubah`,
            data: result
        })
    })
    .catch(error => {
        return response.json({
            message: error.message
        })
    })
})

// Delete data
app.delete('/:id_outlet', (request, response) => {
    // tampung data yang akan dihapus
    let parameter = {
        id_outlet : request.params.id_outlet
    }
   
    outlet.destroy({where: parameter})
    .then (result => {
        return response.json({
            message: 'data berhasil dihapus'
        })
        .catch(error => {
            return response.json({
                message : error.message
            })
        })
    })
})
module.exports = app