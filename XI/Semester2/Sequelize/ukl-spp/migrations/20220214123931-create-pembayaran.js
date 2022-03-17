'use strict';
module.exports = {
  async up(queryInterface, Sequelize) {
    await queryInterface.createTable('pembayaran', {
      id_pembayaran: {
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,
        type: Sequelize.INTEGER(11)
      },
      id_petugas: {
        allowNull: false,
        type: Sequelize.INTEGER(11),
        references: {
          model: "petugas",
          key: "id_petugas"
        }
      },
      nisn: {
        allowNull: false,      
        type: Sequelize.STRING(10),
        references: {
          model: "siswa",
          key: "nisn"
        }
      },
      tgl_bayar: {
        type: Sequelize.DATE
      },
      bulan_dibayar: {
        type: Sequelize.STRING(8)
      },
      tahun_dibayar: {
        type: Sequelize.STRING(4)
      },
      id_spp: {
        allowNull: false,
        type: Sequelize.INTEGER(11),
        references: {
          model: "siswa",
          key: "id_spp"
        }
      },
      jumlah_bayar: {
        type: Sequelize.INTEGER(11)
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
  async down(queryInterface, Sequelize) {
    await queryInterface.dropTable('pembayaran');
  }
};

