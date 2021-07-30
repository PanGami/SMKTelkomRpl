const Hapi = require('@hapi/hapi');
const routes = require('./routes');
const init = async () => {
  const server = Hapi.server({
    port: 5000,
    host: 'localhost',
    routes: {
      cors: {
        origin: ['*'],
      },
    },
  });
  
  server.route(routes);
  await server.start();
  console.log(`server started at ${server.info.uri}`);
};
init();

// Test App
// http://ec2-13-212-153-62.ap-southeast-1.compute.amazonaws.com:5000/
// http://notesapp-v1.dicodingacademy.com/