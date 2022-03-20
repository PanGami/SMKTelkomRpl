//import
const express = require('express');
const cors = require('cors');

//implementasi
const app = express();
app.use(cors());

//endpoint petugas
const petugas = require('./routes/petugas');
app.use("/petugas", petugas)

//endpoint spp
const spp = require('./routes/spp');
app.use("/spp", spp)

//endpoint siswa
const siswa = require('./routes/siswa');
app.use("/siswa", siswa)

//endpoint kelas
const kelas = require('./routes/kelas');
app.use("/kelas", kelas)

//run server
app.listen(8080, () => {
    console.log('server run on port 8080')
})
