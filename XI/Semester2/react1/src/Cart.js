import React, { Component } from "react";
class Cart extends Component {
  initCart = () => {
    // memanggil data cart pada localStorage
    let tempCart = [];
    if (localStorage.getItem("cart") !== null) {
      tempCart = JSON.parse(localStorage.getItem("cart"));
    }
    // memanggil data user pada localStorage
    let userName = localStorage.getItem("user");
    // kalkulasi total harga
    let totalHarga = 0;
    tempCart.map((item) => {
      totalHarga += item.harga * item.jumlahBeli;
    });
    // memasukkan data cart, user, dan total harga pada state
    this.setState({
      cart: tempCart,
      user: userName,
      total: totalHarga,
    });
  };
  componentDidMount() {
    this.initCart();
  }
  constructor() {
    super();
    this.state = {
      cart: [],
      user: "",
      total: 0,
    };
  }
  render() {
    return (
      <div className="container">
        <div className="card col-12 mt-2">
          <div className="card-header bg-primary text-white">
            <h4>Data Keranjang Belanja</h4>
          </div>
          <div className="card-body">
            <h5 className="text-primary">Nama User: {this.state.user}</h5>
            <table className="table table-bordered">
              <thead>
                <tr>
                  <th>Nama Item</th>
                  <th>Harga</th>
                  <th>Qty</th>
                  <th>Total</th>
                </tr>
              </thead>
              <tbody>
                {this.state.cart.map((item, index) => (
                  <tr key={index}>
                    <td>{item.judul}</td>
                    <td>Rp {item.harga}</td>
                    <td>{item.jumlahBeli}</td>
                    <td>Rp {item.harga * item.jumlahBeli}</td>
                  </tr>
                ))}
              </tbody>
            </table>
            <h4 className="text-danger">Total Harga: Rp {this.state.total}</h4>
          </div>
        </div>
      </div>
    );
  }
}
export default Cart;
