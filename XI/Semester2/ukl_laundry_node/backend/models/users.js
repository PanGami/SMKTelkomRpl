'use strict';
const {
  Model
} = require('sequelize');
module.exports = (sequelize, DataTypes) => {
  class users extends Model {
    /**
     * Helper method for defining associations.
     * This method is not a part of Sequelize lifecycle.
     * The `models/index` file will call this method automatically.
     */
    static associate(models) {
      this.belongsTo(models.outlet, {
        foreignKey : "id_outlet", as: "user_outlet"
      })
    }
  };
  users.init({
    id_user: {
      type : DataTypes.INTEGER,
      primaryKey : true,
      autoIncrement : true
    },
    nama: DataTypes.STRING,
    username: DataTypes.STRING,
    password: DataTypes.STRING,
    id_outlet: DataTypes.INTEGER,
    role: DataTypes.ENUM('admin', 'kasir', 'owner')
  }, {
    sequelize,
    modelName: 'users',
    tableName: 'users'
  });
  return users;
};