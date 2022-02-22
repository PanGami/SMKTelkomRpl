'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class transaksi extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // define association here
    }
  }
  transaksi.init({
    customer_id: DataTypes.INTEGER,
    waktu: DataTypes.DATE
  }, {
    sequelize,
    modelName: 'transaksi',
  });
  return transaksi;
};