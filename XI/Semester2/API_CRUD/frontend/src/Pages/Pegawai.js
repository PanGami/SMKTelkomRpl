import React, { Component } from "react";
import $ from "jquery";
import axios from "axios";

class Pegawai extends Component {

  bind = (event) => {
    this.setState({[event.target.name]: event.target.value});
  }

  close = () =>{
    $("#modal_pegawai").hide();
  }

  add = () => {     
    $("#modal_pegawai").show();    
    this.setState({
      nip: "",
      nama: "",
      alamat: "",
      action: "insert"
    });
  }

  Edit = (item) => {
    $("#modal_pegawai").show();
    this.setState({
      nip: item.nip,
      nama: item.nama,
      alamat: item.alamat,
      action: "update"
    });
  }

  getPegawai = () => {
    let url = "http://localhost:2910/pegawai";    
    axios.get(url)
    .then(response => {      
      this.setState({pegawai: response.data.pegawai});
    })
    .catch(error => {
      console.log(error);
    });
  }

  findPegawai = (event) => {
    let url = "http://localhost:2910/pegawai";
    if (event.keyCode === 13) {      
      let form = {
        find: this.state.search
      }      
      axios.post(url, form)
      .then(response => {        
        this.setState({pegawai: response.data.pegawai});
      })
      .catch(error => {
        console.log(error);
      });
    }
  }

  SavePegawai = (event) => {
    event.preventDefault();
    let url = "";
    if (this.state.action === "insert") {
      url = "http://localhost:2910/pegawai/save"
    } else {
      url = "http://localhost:2910/pegawai/update"
    }
    

    let form = {
      nip: this.state.nip,
      nama: this.state.nama,
      alamat: this.state.alamat
    }
    axios.post(url, form)
    .then(response => {
      this.getPegawai();
    })
    .catch(error => {
      console.log(error);
    });    
    $("#modal_pegawai").modal('hide');
  }

  Drop = (nip) => {
    let url = "http://localhost:2910/pegawai/" + nip;
    if (window.confirm('Apakah Anda yakin ingin menghapus data ini?')) {
      axios.delete(url)
      .then(response => {
        this.getPegawai();
      })
      .catch(error => {
        console.log(error);
      });
    }
  }

  componentDidMount(){
    this.getPegawai()
  }

   
  constructor() {
    super();
    this.state = {
      pegawai: [], // array pegawai untuk menampung data pegawai
      nip: "",
      nama: "",
      alamat: "",
      action: "",
      search: "",
    };
  }

  render() {
    return (
      <div className="m-3 card">
        <div className="card-header bg-info text-white">Data Pegawai</div>
        <div className="card-body">
          <input
            type="text"
            className="form-control mb-2"
            name="search"
            value={this.state.search}
            onChange={this.bind}
            onKeyUp={this.findPegawai}
            placeholder="Pencarian..."
          />
          {/* tampilan tabel pegawai */}
          <table className="table">
            <thead>
              <tr>
                <th>NIP</th>
                <th>Nama</th>
                <th>Alamat</th>
                <th>Option</th>
              </tr>
            </thead>
            <tbody>
              {this.state.pegawai.map((item, index) => {
                return (
                  <tr key={index}>
                    <td>{item.nip}</td>
                    <td>{item.nama}</td>
                    <td>{item.alamat}</td>
                    <td>
                      <button
                        className="btn btn-sm btn-info m-1"
                        data-toggle="modal"
                        data-target="#modal_pegawai"
                        onClick={() => this.Edit(item)}
                      >
                        Edit
                      </button>
                      <button
                        className="btn btn-sm btn-danger m-1"
                        onClick={() => this.Drop(item.nip)}
                      >
                        Hapus
                      </button>
                    </td>
                  </tr>
                );
              })}
            </tbody>
          </table>
          <button
            className="btn btn-success"
            onClick={this.add}           
          >
            Tambah Data
          </button>          
          <div className="modal" id="modal_pegawai">
            <div className="modal-dialog">
              <div className="modal-content">
                <div className="modal-header"><h5>Form Pegawai</h5>
                  <button className="btn btn-danger"onClick={() => this.close()}>
                    X
                  </button>
                </div>
                <form onSubmit={this.SavePegawai}>
                  <div className="modal-body">
                    NIP
                    <input
                      type="number"
                      name="nip"
                      value={this.state.nip}
                      onChange={this.bind}
                      className="form-control"
                      required
                    />
                    Nama
                    <input
                      type="text"
                      name="nama"
                      value={this.state.nama}
                      onChange={this.bind}
                      className="form-control"
                      required
                    />
                    Alamat
                    <input
                      type="text"
                      name="alamat"
                      value={this.state.alamat}
                      onChange={this.bind}
                      className="form-control"
                      required
                    />
                  </div>
                  <div className="modal-footer">
                    <button className="btn btn-sm btn-success" type="submit">
                      Simpan
                    </button>                    
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
export default Pegawai;
