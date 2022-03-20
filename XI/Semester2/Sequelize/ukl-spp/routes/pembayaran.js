//import auth
const auth = require("../auth");
const jwt = require("jsonwebtoken");
const SECRET_KEY = "spp-secret-key";

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
const pembayaran = model.pembayaran;

//endpoint menampilkan semua data pembayaran, method: GET, function: findAll()
app.get("/", (req, res) => {
  pembayaran
    .findAll()
    .then((result) => {
      res.json({
        pembayaran: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

// Get data pembayaran berdasarkan nisn yang diberikan pada body
app.get("/id", (req, res) => {
  pembayaran
    .findOne({ where: { id_pembayaran: req.params.id } })
    .then((result) => {
      res.json({
        pembayaran: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

//endpoint membuat pembayaran
app.post("/", (req, res) => {
  let data = {
    // id_petugas
    // nisn
    tgl_bayar: sequelize.literal('CURRENT_TIMESTAMP'),
    bulan_dibayar: req.body.bulan_dibayar,
    tahun_dibayar: req.body.tahun_dibayar,
    // id_spp
    jumlah_bayar: req.body.jumlah_bayar,
  };

  pembayaran
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

//endpoint mengupdate data pembayaran berdasarkan nisn (hanya dengan login dari petugas atau admin)
app.put("/", auth, (req, res) => {
  let param = {
    nisn : req.body.nisn,
  };
  let data = {
    // id_petugas
    // nisn
    tgl_bayar: sequelize.literal('CURRENT_TIMESTAMP'),
    bulan_dibayar: req.body.bulan_dibayar,
    tahun_dibayar: req.body.tahun_dibayar,
    // id_spp
    jumlah_bayar: req.body.jumlah_bayar,
  };
  pembayaran
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

//endpoint menghapus data pembayaran (hanya dapat dilakukan oleh petugas atau admin), METHOD: DELETE, function: destroy
app.delete("/", auth, (req, res) => {
  let param = {
    nisn : req.body.nisn,
  };
  pembayaran
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