//import
const express = require('express');
const cors = require('cors');

//implementasi
const app = express();
app.use(cors());

//endpoint admin
const spp = require('./routes/spp');
app.use("/spp", spp)

//run server
app.listen(8080, () => {
    console.log('server run on port 8080')
})
