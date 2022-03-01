// //import auth
// const auth = require("../auth")
// const jwt = require("jsonwebtoken")
// const SECRET_KEY = "BelajarNodeJSItuMenyengankan"

// //import library
// const express = require("express");
// const bodyParser = require("body-parser");
// const md5 = require("md5");

// //implementasi library
// const app = express();
// app.use(bodyParser.json());
// app.use(bodyParser.urlencoded({ extended: true }));

// //import model
// const model = require("../models/index");
// const spp = model.spp;

// //endpoint menampilkan semua data spp, method: GET, function: findAll()
// app.get("/", auth, (req, res) => {
//   spp
//     .findAll()
//     .then((result) => {
//       res.json({
//         spp: result,
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });

// // Get data spp berdasarkan nomor id -> method: GET, function: findOne()
// app.get("/:id_spp", auth, (req, res) => {
//   spp
//     .findOne({ where: { id_spp: req.params.id_spp } })
//     .then((result) => {
//       res.json({
//         spp: result,
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });
 
// //endpoint untuk menyimpan data spp, METHOD: POST, function: create
// app.post("/", auth, (req, res) => {
//   let data = {
//     tahun: req.body.tahun,
//     nominal: req.body.nominal,
//   };

//   spp
//     .create(data)
//     .then((result) => {
//       res.json({
//         message: "data has been inserted",
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });

// // Endpoint untuk login
// // app.post("/auth", async (req,res) => {
// //   let params = {
// //       username: req.body.username,
// //       password: md5(req.body.password)
// //   }

// //   let result = await spp.findOne({where: params})
// //   if(result){
// //       let payload = JSON.stringify(result)
// //       // generate token
// //       let token = jwt.sign(payload, SECRET_KEY)
// //       res.json({
// //           logged: true,
// //           data: result,
// //           token: token
// //       })
// //   }else{
// //       res.json({
// //           logged: false,
// //           message: "Invalid username or password"
// //       })
// //   }
// // })

// app.put("/:id", auth, (req, res) => {
//   let param = {
//     id_spp: req.params.id,
//   };
//   let data = {
//     tahun: req.body.tahun,
//     nominal: req.body.nominal,
//   };
//   spp
//     .update(data, { where: param })
//     .then((result) => {
//       res.json({
//         message: "data has been updated",
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });

// //endpoint menghapus data spp, METHOD: DELETE, function: destroy
// app.delete("/:id", auth, (req, res) => {
//   let param = {
//     id_spp: req.params.id,
//   };
//   spp
//     .destroy({ where: param })
//     .then((result) => {
//       res.json({
//         message: "data has been deleted",
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });

// module.exports = app;
