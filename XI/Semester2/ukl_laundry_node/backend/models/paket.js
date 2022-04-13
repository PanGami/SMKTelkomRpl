'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class paket extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      this.belongsTo(models.outlet, {
        foreignKey : "id_outlet", as: "paket_outlet"
      })
    }
  };
  paket.init({
    id_paket: {
      type : DataTypes.INTEGER,
      primaryKey: true,
      autoIncrement: true
    },
    id_outlet: DataTypes.INTEGER,  
    jenis_paket: DataTypes.ENUM('kiloan','selimut','bed_cover','lain'),
    nama_paket: DataTypes.STRING,
    harga: DataTypes.DOUBLE
  }, {
    sequelize,
    modelName: 'paket',
    tableName: 'paket'
  });
  return paket;
};