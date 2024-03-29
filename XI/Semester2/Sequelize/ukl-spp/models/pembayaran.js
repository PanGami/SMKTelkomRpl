"use strict";
const { Model } = require("sequelize");
module.exports = (sequelize, DataTypes) => {
  class pembayaran extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      // define association here
      this.belongsTo(models.siswa, {
        foreignKey: "nisn",
        as: "siswa pembayaran", //harus dikasih alias, mengapa?
      });
      this.belongsTo(models.petugas, {
        foreignKey: "id_petugas",
      });
      this.belongsToMany(models.spp, {
        through: "siswa",
        foreignKey: "id_spp", 
      })
    }
  }
  pembayaran.init(
    {
      id_pembayaran: {
        type: DataTypes.INTEGER,
        primaryKey: true,
        autoIncrement: true,
      },
      id_petugas: DataTypes.INTEGER,
      nisn: DataTypes.STRING,
      tgl_bayar: DataTypes.DATE,
      bulan_dibayar: DataTypes.STRING,
      tahun_dibayar: DataTypes.STRING,
      id_spp: DataTypes.INTEGER,
      jumlah_bayar: DataTypes.INTEGER,
    },
    {
      sequelize,
      modelName: "pembayaran",
      tableName: "pembayaran",
    }
  );
  return pembayaran;
};
