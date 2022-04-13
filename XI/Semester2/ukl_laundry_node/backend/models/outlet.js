'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class outlet extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      this.hasMany(models.paket, {
        foreignKey : "id_outlet", as: "paket_outlet"        
      })
      this.hasMany(models.transaksi, {
        foreignKey : "id_outlet", as: "transaksi_outlet"    
      })
      this.hasMany(models.user, {
        foreignKey : "id_outlet", as: "user_outlet"    
      })
    }
  }
  outlet.init({
    id_outlet: {
      type:DataTypes.INTEGER, 
      primaryKey: true, 
      autoIncrement: true
    },
    nama: DataTypes.STRING,
    alamat: DataTypes.TEXT,
    telepon: DataTypes.STRING
  }, {
    sequelize,
    modelName: 'outlet',
  });
  return outlet;
};