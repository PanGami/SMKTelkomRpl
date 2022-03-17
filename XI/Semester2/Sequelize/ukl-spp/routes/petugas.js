// STILL IN DEV, COPIED FROM OTHER PROJECT <<<<<<<<<<<<<<<<<<<<<<<<<<<

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
// const petugas = model.petugas;

// //endpoint menampilkan semua data petugas, method: GET, function: findAll()
// app.get("/", auth, (req, res) => {
//   petugas
//     .findAll()
//     .then((result) => {
//       res.json({
//         petugas: result,
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });

// // Get data petugas berdasarkan nomor id -> method: GET, function: findOne()
// app.get("/:petugas_id", auth, (req, res) => {
//   petugas
//     .findOne({ where: { petugas_id: req.params.petugas_id } })
//     .then((result) => {
//       res.json({
//         petugas: result,
//       });
//     })
//     .catch((error) => {
//       res.json({
//         message: error.message,
//       });
//     });
// });
 
// //endpoint untuk menyimpan data petugas, METHOD: POST, function: create
// app.post("/", auth, (req, res) => {
//   let data = {
//     name: req.body.name,
//     username: req.body.username,
//     password: md5(req.body.password),
//   };

//   petugas
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
// app.post("/auth", async (req,res) => {
//   try{
//     let params = {
//         username: req.body.username,
//         password: md5(req.body.password)
//     }
//     console.log(params);
//     console.log(petugas);
//     let result = await petugas.findOne({where: params})
//     if(result){
//         let payload = JSON.stringify(result)
//         // generate token
//         let token = jwt.sign(payload, SECRET_KEY)
//         res.json({
//             logged: true,
//             data: result,
//             token: token
//         })
//     }else{
//         res.json({
//             logged: false,
//             message: "Invalid username or password"
//         })
//     }
//   }catch(error){
//     res.json({
//         message: error.message,
//     })
//   }
// })


//   // make .catch(). To terminate the node process on unhandled promise rejection
//   // petugas
//   // .then((result) => {
//   //   res.json({
//   //     message: "login Succesfull",
//   //   });
//   // })
//   // .catch((error) => {
//   //   res.json({
//   //     message: error.message,
//   //   });
//   // }); 

//   // if (err) return reject(err)

//   // username: await req.body.username,
//   // password: await md5(req.body.password)


// //endpoint mengupdate data petugas, METHOD: PUT, function:update
// app.put("/:id", auth, (req, res) => {
//   let param = {
//     petugas_id: req.params.id,
//   };
//   let data = {
//     name: req.body.name,
//     username: req.body.username,
//     password: md5(req.body.password),
//   };
//   petugas
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

// //endpoint menghapus data petugas, METHOD: DELETE, function: destroy
// app.delete("/:id", auth, (req, res) => {
//   let param = {
//     petugas_id: req.params.id,
//   };
//   petugas
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
