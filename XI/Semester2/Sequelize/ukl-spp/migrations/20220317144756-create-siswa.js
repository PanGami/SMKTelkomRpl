"use strict";
module.exports = {
  async up(queryInterface, Sequelize) {
    await queryInterface.createTable("siswa", {
      nisn: {
        allowNull: false,
        primaryKey: true,
        type: Sequelize.STRING(10),
        references: {
          model: "pembayaran",
          key: "nisn",
        },
      },
      nis: {
        type: Sequelize.STRING(8),
      },
      nama: {
        type: Sequelize.STRING(35),
      },
      id_kelas: {
        allowNull: false,
        type: Sequelize.INTEGER(11),
        references: {
          model: "kelas",
          key: "id_kelas",
        },
      },
      alamat: {
        type: Sequelize.TEXT,
      },
      no_telp: {
        type: Sequelize.STRING(13),
      },
      id_spp: {
        allowNull: false,
        type: Sequelize.INTEGER(11),
        references: {
          model: "spp",
          key: "id_spp",
        },
      },
      createdAt: {
        allowNull: false,
        type: Sequelize.DATE,
      },
      updatedAt: {
        allowNull: false,
        type: Sequelize.DATE,
      },
    });
  },
  async down(queryInterface, Sequelize) {
    await queryInterface.dropTable("siswa");
  },
};
