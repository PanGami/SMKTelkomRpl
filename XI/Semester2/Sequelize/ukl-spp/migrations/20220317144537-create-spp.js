"use strict";
module.exports = {
  async up(queryInterface, Sequelize) {
    await queryInterface.createTable("spp", {
      id_spp: {
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,
        type: Sequelize.INTEGER(11),
      },
      tahun: {
        type: Sequelize.INTEGER(11),
      },
      nominal: {
        type: Sequelize.INTEGER(11),
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
    await queryInterface.dropTable("spp");
  },
};
