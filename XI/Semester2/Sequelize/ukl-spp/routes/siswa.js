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
const siswa = model.siswa;
const spp = model.spp;
const kelas = model.kelas;

//endpoint menampilkan semua data siswa, method: GET, function: findAll()

// app.get("/", (req, res) => {
//   siswa
//     .findAll()
//     .then((result) => {
//       kelas
//       .findOne({where: {id_kelas: result[0].id_kelas}})
//       .then((result2) => {
//         spp
//         .findOne({where: {id_spp: result[0].id_spp}})
//         .then((result3) => {res.json({result : result, result2 : result2, result3 : result3})}) 
//       })
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });

// Get data siswa berdasarkan nisn yang diberikan pada body
app.get("/", (req, res) => {
  siswa
    .findOne({ where: { nisn: req.body.nisn } })
    .then((result) => {
      res.json({
        siswa: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

//endpoint membuat siswa
app.post("/", (req, res) => {
  let data = {
    nisn: req.body.nisn,
    nis: req.body.nis,
    nama: req.body.nama,
    id_kelas: req.body.id_kelas,
    alamat: req.body.alamat,
    no_telp: req.body.no_telp,
    id_spp: req.body.id_spp,
  };

  siswa
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

//endpoint mengupdate data siswa berdasarkan nisn (hanya dengan login dari petugas atau admin)
app.put("/", auth, (req, res) => {
  let param = {
    nisn : req.body.nisn,
  };
  let data = {
    nisn: req.body.nisn,
    nis: req.body.nis,
    nama: req.body.nama,
    id_kelas: req.body.id_kelas,
    alamat: req.body.alamat,
    no_telp: req.body.no_telp,
    id_spp: req.body.id_spp,
  };
  siswa
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

//endpoint menghapus data siswa (hanya dapat dilakukan oleh petugas atau admin), METHOD: DELETE, function: destroy
app.delete("/", auth, (req, res) => {
  let param = {
    nisn : req.body.nisn,
  };
  siswa
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
