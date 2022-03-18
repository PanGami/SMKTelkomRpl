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
const spp = model.spp;

//endpoint menampilkan semua data spp, method: GET, function: findAll()
app.get("/", (req, res) => {
  spp
    .findAll()    
    .then((result) => {
      res.json({
        spp: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

// Get data spp berdasarkan nomor id -> method: GET, function: findOne()
app.get("/:id_spp", (req, res) => {
  spp
    .findOne({ where: { id_spp: req.params.id_spp } })
    .then((result) => {
      res.json({
        spp: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});
 
//endpoint untuk menyimpan data spp, METHOD: POST, function: create
app.post("/", (req, res) => {
  let data = {
    tahun: req.body.tahun,
    nominal: req.body.nominal,
  };
  spp
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

app.put("/:id", auth, (req, res) => {
  let param = {
    id_spp: req.params.id,
  };
  let data = {
    tahun: req.body.tahun,
    nominal: req.body.nominal,
  };
  spp
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

//endpoint menghapus data spp, METHOD: DELETE, function: destroy
app.delete("/:id", auth, (req, res) => {
  let param = {
    id_spp: req.params.id,
  };
  spp
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
