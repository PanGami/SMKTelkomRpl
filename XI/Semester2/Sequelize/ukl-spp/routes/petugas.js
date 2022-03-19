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
const petugas = model.petugas;


// Endpoint untuk login
app.post("/auth", async (req,res) => {
    let params = {
        username: req.body.username,
        password: md5(req.body.password)
    }
  
    let result = await petugas.findOne({where: params})
    if(result){
        let payload = JSON.stringify(result)
        // generate token
        let token = jwt.sign(payload, SECRET_KEY)
        res.json({
            logged: true,
            data: result,
            token: token
        })
    }else{
        res.json({
            logged: false,
            message: "Invalid username or password"
        })
    }
  })

//endpoint menampilkan semua data petugas, method: GET, function: findAll()
app.get("/", auth, (req, res) => {
  petugas
    .findAll()
    .then((result) => {
      res.json({
        petugas: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});

// Get data petugas berdasarkan nomor id -> method: GET, function: findOne()
app.get("/:id", auth, (req, res) => {
  petugas
    .findOne({ where: { id_petugas: req.params.id } })
    .then((result) => {
      res.json({
        petugas: result,
      });
    })
    .catch((error) => {
      res.json({
        message: error.message,
      });
    });
});
 
//endpoint membuat petugas maupun admin
app.post("/", (req, res) => {
  let data = {
    nama_petugas: req.body.nama_petugas,
    username: req.body.username,
    password: md5(req.body.password),
    level: req.body.level,
  };

  petugas
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

//endpoint mengupdate data petugas, METHOD: PUT, function:update
app.put("/:id", auth, (req, res) => {
  let param = {
    petugas_id: req.params.id,
  };
  let data = {
    nama_petugas: req.body.nama_petugas,
    username: req.body.username,
    password: md5(req.body.password),
  };
  petugas
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

//endpoint menghapus data petugas, METHOD: DELETE, function: destroy
app.delete("/:id", auth, (req, res) => {
  let param = {
    id_petugas: req.params.id,
  };
  petugas
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
