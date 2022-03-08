import React, { Component } from "react";
import $ from "jquery";
import Card from "./Card.js";
class ListGallery extends Component {
  Add = () => {
    // menampilkan komponen modal
    $("#modal_buku").modal("show");
    this.setState({
      isbn: Math.random(1, 10000000),
      judul: "",
      penulis: "",
      penerbit: "",
      cover: "",
      harga: 0,
      action: "insert",
    });
  };
  Edit = (item) => {
    // menampilkan komponen modal
    $("#modal_buku").modal("show");
    this.setState({
      isbn: item.isbn,
      judul: item.judul,
      penulis: item.penulis,
      penerbit: item.penerbit,
      cover: item.cover,
      harga: item.harga,
      action: "update",
      selectedItem: item,
    });
  };
  Save = (event) => {
    event.preventDefault();
    // menampung data state buku
    let tempBuku = this.state.buku;
    if (this.state.action === "insert") {
      // menambah data baru
      tempBuku.push({
        isbn: this.state.isbn,
        judul: this.state.judul,
        penulis: this.state.penulis,
        penerbit: this.state.penerbit,
        cover: this.state.cover,
        harga: this.state.harga,
      });
    } else if (this.state.action === "update") {
      // menyimpan perubahan data
      let index = tempBuku.indexOf(this.state.selectedItem);
      tempBuku[index].isbn = this.state.isbn;
      tempBuku[index].judul = this.state.judul;
      tempBuku[index].penulis = this.state.penulis;
      tempBuku[index].penerbit = this.state.penerbit;
      tempBuku[index].cover = this.state.cover;
      tempBuku[index].harga = this.state.harga;
    }
    this.setState({ buku: tempBuku });

    // menutup komponen modal_buku
    $("#modal_buku").modal("hide");
  };
  Drop = (item) => {
    // beri konfirmasi untuk menghapus data
    if (window.confirm("Apakah anda yakin ingin menghapus data ini?")) {
      // menghapus data
      let tempBuku = this.state.buku;
      // posisi index data yg akan dihapus
      let index = tempBuku.indexOf(item);
      // hapus data
      tempBuku.splice(index, 1);
      this.setState({ buku: tempBuku });
    }
  };
  constructor() {
    super();
    this.state = {
      buku: [
        {
          isbn: "12345",
          judul: "Bulan",
          penulis: "Tere Liye",
          penerbit: "CV Harapan Kita",
          harga: 90000,
          cover:
            "https://drive.google.com/uc?id=1ui-jyKgu3DqFyo7VKJu-FFXkaNQN3aSg",
        },
        {
          isbn: "12346",
          judul: "Anak Badai",
          penulis: "Tere Liye",
          penerbit: "CV Nusa Bangsa",
          harga: 80000,
          cover:
            "https://drive.google.com/uc?id=1rJDcCOmsd14NL6DG3Wps_kewZomGcLU-",
        },
        {
          isbn: "54321",
          judul: "Bumi",
          penulis: "Tere Liye",
          penerbit: "CV Nusa Bangsa",
          harga: 70000,
          cover:
            "https://drive.google.com/uc?id=1e-thvq7lkG1_gw0FqHzRoiAhfhdgpOUj",
        },
        {
            isbn: "12345",
            judul: "Bulan",
            penulis: "Tere Liye",
            penerbit: "CV Harapan Kita",
            harga: 95000,
            cover:
              "https://drive.google.com/uc?id=1ui-jyKgu3DqFyo7VKJu-FFXkaNQN3aSg",
          },
      ],
      action: "",
      isbn: "",
      judul: "",
      penulis: "",
      penerbit: "",
      harga: 0,
      cover: "",
      selectedItem: null,
    };
  }
  render() {
    return (
      <div className="container gallery">
        <div className="row">
          {this.state.buku.map((item, index) => (
            <Card
              judul={item.judul}
              penulis={item.penulis}
              penerbit={item.penerbit}
              harga={item.harga}
              cover={item.cover}
              onEdit={() => this.Edit(item)}
              onDrop={() => this.Drop(item)}
            />
          ))}
        </div>
        <button className="btn btn-success" onClick={() => this.Add()}>
          Tambah Data
        </button>
        {/* component modal sbg control manipulasi data */}
        <div className="modal" id="modal_buku">
          <div className="modal-dialog">
            <div className="modal-content">
              {/* modal header */}
              <div className="modal-header">Form Buku</div>
              {/* modal body */}
              <div className="modal-body">
                <form onSubmit={(ev) => this.Save(ev)}>
                  Judul Buku
                  <input
                    type="text"
                    className="form-control mb-2"
                    value={this.state.judul}
                    onChange={(ev) => this.setState({ judul: ev.target.value })}
                    required
                  />
                  Penulis Buku
                  <input
                    type="text"
                    className="form-control mb-2"
                    value={this.state.penulis}
                    onChange={(ev) =>
                      this.setState({ penulis: ev.target.value })
                    }
                    required
                  />
                  Penerbit Buku
                  <input
                    type="text"
                    className="form-control mb-2"
                    value={this.state.penerbit}
                    onChange={(ev) =>
                      this.setState({ penerbit: ev.target.value })
                    }
                    required
                  />
                  Harga Buku
                  <input
                    type="number"
                    className="form-control mb-2"
                    value={this.state.harga}
                    onChange={(ev) => this.setState({ harga: ev.target.value })}
                    required
                  />
                  Cover Buku
                  <input
                    type="url"
                    className="form-control mb-2"
                    value={this.state.cover}
                    onChange={(ev) => this.setState({ cover: ev.target.value })}
                    required
                  />
                  <button className="btn btn-info btn-block" type="submit">
                    Simpan
                  </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default ListGallery;
