'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class detail_transaksi extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // define association here
    }
  }
  detail_transaksi.init({
    transaksi_id: DataTypes.INTEGER,
    product_id: DataTypes.INTEGER,
    price: DataTypes.DOUBLE,
    qty: DataTypes.DOUBLE
  }, {
    sequelize,
    modelName: 'detail_transaksi',
  });
  return detail_transaksi;
};