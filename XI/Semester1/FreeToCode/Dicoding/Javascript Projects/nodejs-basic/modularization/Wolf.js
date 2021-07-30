const Tiger = require("./Tiger");

class Wolf {
    constructor() {
      this.strength = Math.floor(Math.random() * 100);
    }
   
    howl() {
      console.log('owooooo!')
    }
  }
   
  // TODO 2
  module.exports = Tiger;