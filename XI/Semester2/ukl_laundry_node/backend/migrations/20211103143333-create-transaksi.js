'use strict';
module.exports = {
  up: async (queryInterface, Sequelize) => {
    await queryInterface.createTable('transaksi', {
      id_transaksi: {
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,
        type: Sequelize.INTEGER
      },
      id_outlet:{
        type: Sequelize.INTEGER,
        references:{
          model: "outlet",
          key: "id_outlet"
        }
      },
      kode_invoice:{
        type: Sequelize.STRING
      },
      id_member: {
        type: Sequelize.INTEGER,
        references:{
          model: "member",
          key: "id_member"
        }
      },
      tgl: {
        type: Sequelize.DATE
      },
      batas_waktu: {
        type: Sequelize.DATE
      },
      tgl_bayar: {
        type: Sequelize.DATE
      },
      biaya_tambahan: {
        type: Sequelize.INTEGER
      },
      diskon: {
        type: Sequelize.DOUBLE
      },
      pajak: {
        type: Sequelize.DOUBLE
      },
      status: {
        type: Sequelize.ENUM('baru','proses','selesai','diambil')
      },
      dibayar: {
        type: Sequelize.ENUM('dibayar','belum_dibayar')
      },
      id_user: {
        type: Sequelize.INTEGER,
        references:{
          model: 'users',
          key: 'id_user'
        }
      },
      createdAt: {
        allowNull: false,
        type: Sequelize.DATE
      },
      updatedAt: {
        allowNull: false,
        type: Sequelize.DATE
      }
    });
  },
  down: async (queryInterface, Sequelize) => {
    await queryInterface.dropTable('transaksi');
  }
};