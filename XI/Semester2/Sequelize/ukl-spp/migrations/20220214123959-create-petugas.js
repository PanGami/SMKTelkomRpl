'use strict';
module.exports = {
  async up(queryInterface, Sequelize) {
    await queryInterface.createTable('petugas', {
      id_petugas: {
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,
        type: Sequelize.INTEGER(11)
      },
      username: {
        type: Sequelize.STRING(25)
      },
      password: {
        type: Sequelize.STRING(32)
      },
      nama_petugas: {
        type: Sequelize.STRING(35)
      },
      level: {
        type: Sequelize.ENUM('admin', 'petugas')
      },
    });
  },
  async down(queryInterface, Sequelize) {
    await queryInterface.dropTable('petugas');
  }
};

