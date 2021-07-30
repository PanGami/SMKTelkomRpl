// TODO: tampilkan teks pada notes.txt pada console.const fs = require('fs');
// const path = require('path');
// const fs = require('fs');

// const isiNotes = fs.readFile(path.resolve(__dirname, 'notes.txt'), 'UTF-8', fileReadCallback);
// console.log(isiNotes);

// Atau menggunakan

const path = require('path');
const fs = require('fs');

 
const fileReadCallback = (error, isiNotes) => {
    if(error) {
        console.log('Gagal membaca berkas');
        return;
    }
    console.log(isiNotes);
};
 
fs.readFile(path.resolve(__dirname, 'notes.txt'), 'UTF-8', fileReadCallback);