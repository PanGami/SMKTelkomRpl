//import express
const express = require("express");
const app = express();
app.use(express.json());

//import model
const models = require("../models/index");
const transaksi = models.transaksi;
const detail_transaksi = models.detail_transaksi;
const product = models.product;

//import auth
const auth = require("../auth");
app.use(auth);

// ====> Fix setelah menambah field price pada detail_transaksi
// Ditambahi try catch
app.get("/", async (req, res) => {
  try {
    let result = await transaksi.findAll({
      include: [
        "customer",
        {
          model: models.detail_transaksi,
          as: "detail_transaksi",
          include: ["product"],
        },
      ],
    });
    res.json(result);
  } catch (error) {
    res.json({
      message: error,
    });
  }
});

// Ditambahi try catch
app.get("/:customer_id", async (req, res) => {
  try {
    let param = { customer_id: req.params.customer_id };
    let result = await transaksi.findAll({
      where: param,
      include: [
        "customer",
        {
          model: models.detail_transaksi,
          as: "detail_transaksi",
          include: ["product"],
        },
      ],
    });
    res.json(result);
  } catch (error) {
    res.json({
      message: error,
    });
  }
});

// Data masuk ke database namun muncul error forEach undefined
// + { individualHooks: true }
// + comment search bug
app.post("/", async (req, res) => {
  
    let current = new Date().toISOString().split("T")[0];
    let data = {
      customer_id: req.body.customer_id,
      waktu: current,
    };

    transaksi
      .create(data)
      .then((result) => {
          let lastID = result.transaksi_id;
          detail = req.body.detail_transaksi;
          detail.forEach((element) => {
            element.transaksi_id = lastID;
          });
        // UPDATE STOCK PRODUCT
        for(let i = 0; i < detail.length; i++){          
          let idProduct = { product_id: detail[i].product_id };        
          product
            .findOne({where: idProduct})
            .then(result => {
              let currStock = result.stock;
              let newStock = { stock: currStock - detail[i].qty }
              product.update(newStock, { where: idProduct })
            })
            .catch(error => {
              res.json({
                message: error.message,
              });
            });
        }
          detail_transaksi
            .bulkCreate(detail, { individualHooks: true })
            .then((result) => {
              res.json({
                message: "Data has been inserted",
              });
            })
            .catch((error) => {
              res.json({
                message: error.message,
              });
            });
        })
    .catch((error) => {
      console.log(error.message);
    });
});

//Tidak ada error
app.delete("/:transaksi_id", async (req, res) => {
  let param = { transaksi_id: req.params.transaksi_id };
  try {
    await detail_transaksi.destroy({ where: param });
    await transaksi.destroy({ where: param });
    res.json({
      message: "data has been deleted",
    });
  } catch (error) {
    res.json({
      message: error,
    });
  }
});

module.exports = app;
