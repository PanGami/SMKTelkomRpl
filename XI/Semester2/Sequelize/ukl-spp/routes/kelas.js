//import auth
const auth = require("../auth")
const jwt = require("jsonwebtoken")
const SECRET_KEY = "spp-secret-key"

//import library
const express = require("express");
const bodyParser = require("body-parser");
const md5 = require("md5");

//implementasi library
const app = express();
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

//import model
const model = require("../models/index");
const kelas = model.kelas;

//endpoint menampilkan semua data kelas, method: GET, function: findAll()
app.get("/", (req, res) => {
  kelas
    .findAll()    
    .then((result) => {
      res.json({
        kelas: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

// Get data kelas berdasarkan nomor id -> method: GET, function: findOne()
app.get("/:id", (req, res) => {
  kelas
    .findOne({ where: { id_kelas: req.params.id } })
    .then((result) => {
      res.json({
        kelas: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});
 
//endpoint untuk membuat data kelas, METHOD: POST, function: create
app.post("/", (req, res) => {
  let data = {
    nama_kelas: req.body.nama_kelas,
    kompetensi_keahlian: req.body.kompetensi_keahlian,
  };
  kelas
    .create(data)
    .then((result) => {
      res.json({
        message: "data has been inserted",
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

// Merubah data kelas berdasarkan id yang dilakukan oleh petugas atau admin -> method: PUT, function: update
app.put("/:id", auth, (req, res) => {
  let param = {
    id_kelas: req.params.id,
  };
  let data = {
    nama_kelas: req.body.nama_kelas,
    kompetensi_keahlian: req.body.kompetensi_keahlian,
  };
  kelas
    .update(data, { where: param })
    .then((result) => {
      res.json({
        message: "data has been updated",
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

//endpoint menghapus data kelas hanya dapat dilakukan oleh admin atau petugas, METHOD: DELETE, function: destroy
app.delete("/:id", auth, (req, res) => {
  let param = {
    id_kelas: req.params.id,
  };
  kelas
    .destroy({ where: param })
    .then((result) => {
      res.json({
        message: "data has been deleted",
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

module.exports = app;
