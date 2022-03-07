import React, { Component } from "react";
import $ from "jquery";
class List extends Component {

  constructor() {
    super();
	// var btn = document.getElementById("myBtn");
	// var modal = document.getElementById("modal");
	// btn.onclick = function() {
	// 	modal.style.display = "block";
	// }
    this.state = {
      siswa: [
        { nis: "100", nama: "Musthofa", alamat: "Surabaya" },
        { nis: "101", nama: "Nurul", alamat: "Malang" },
        { nis: "102", nama: "Misbah", alamat: "Pasuruan" },
      ],
      nis: "",
      nama: "",
      alamat: "",
      action: "",
    };
  }
  bind = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  };

  SaveSiswa = (event) => {
    event.preventDefault();
    let temp = this.state.siswa;

    if (this.state.action === "insert") {
      temp.push({
        nis: this.state.nis,
        nama: this.state.nama,
        alamat: this.state.alamat,
      });
    } else if (this.state.action === "update") {
      let index = temp.findIndex((item) => item.nis === this.state.nis);
      temp[index].nama = this.state.nama;
      temp[index].alamat = this.state.alamat;
    }
    this.setState({ siswa: temp });
    $("#modal").modal("hide");
  };

  Add = () => {
    this.setState({
      nis: "",
      nama: "",
      alamat: "",
      action: "insert",
    });
  };

  Edit = (item) => {
    this.setState({
      nis: item.nis,
      nama: item.nama,
      alamat: item.alamat,
      action: "update",
    });
  };

  Drop = (index) => {
    let temp = this.state.siswa;
    temp.splice(index, 1);
    this.setState({ siswa: temp });
  };
  render() {
    return (
      <div className="container">
        {/* generate list */}
        <ul className="list-group">
          {this.state.siswa.map((item, index) => {
            return (
              <li className="list-group-item" key={index}>
                <h5 className="text-info">{item.nama}</h5>
                <h6>NIS: {item.nis}</h6>
                <h6>Alamat: {item.alamat}</h6>

                <button
                  className="btn btn-sm btn-primary m-1"
                  onClick={() => this.Edit(item)}
                  data-toggle="modal"
                  data-target="#modal"
                >
                  Edit
                </button>
                <button
                  className="btn btn-sm btn-danger m-1"
                  onClick={() => this.Drop(index)}
                >
                  Hapus
                </button>
              </li>
            );
          })}
        </ul>
        <button
          className="btn btn-sm btn-success m-3"
		  id="myBtn"
          onClick={this.Add}
          data-toggle="modal"
          data-target="#modal"
        >
          Tambah Data
        </button>

        {/* elemen form modal */}
        <div className="modal fade" id="modal">
          <div className="modal-dialog">
            <div className="modal-content">
              <div className="modal-header bg-success text-white">
                <h5>Form Siswa</h5>
              </div>
              <form onSubmit={this.SaveSiswa}>
                <div className="modal-body">
                  NIS
                  <input
                    type="text"
                    name="nis"
                    className="form-control"
                    onChange={this.bind}
                    value={this.state.nis}
                  />
                  Nama
                  <input
                    type="text"
                    name="nama"
                    className="form-control"
                    onChange={this.bind}
                    value={this.state.nama}
                  />
                  Alamat
                  <input
                    type="text"
                    name="alamat"
                    className="form-control"
                    onChange={this.bind}
                    value={this.state.alamat}
                  />
                </div>
                <div className="modal-footer">
                  <button type="submit" className="btn btn-primary">
                    Simpan
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
export default List;
