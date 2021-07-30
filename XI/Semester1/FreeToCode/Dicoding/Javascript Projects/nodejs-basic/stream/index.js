/**
 * TODO:
 * Buatlah program untuk membaca teks input.txt dan menuliskannya ulang pada berkas output.txt
 * menggunakan teknik readable stream dan writable stream.
 */
 const fs = require('fs');
 const path = require('path');

 const isiInput = fs.createReadStream(path.resolve(__dirname,'input.txt'),{
     highWaterMark : 15
 });

 const writableStream = fs.createWriteStream(path.resolve(__dirname, './output.txt'));
 
 isiInput.on('readable', () => {
    try {
        const isi = `${isiInput.read()}`
        writableStream.write(isi);
    } catch (error) {s
        console.log(error);
    }
 });