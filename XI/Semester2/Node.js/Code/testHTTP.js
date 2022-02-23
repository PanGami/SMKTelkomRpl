const http = require('http')
http.createServer(function(req, res){
 res.writeHead(200, {'Content-Type':'text/html'})
 res.write('Hallo Dunia')
 res.end()
}).listen(8080)
console.log("Aplikasi berjalan")