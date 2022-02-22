import React, { Component } from "react";
import {Routes, Route} from "react-router-dom";

// import Test from "./pages/test"
import Main from "./Pages/defaultReact"
import Pegawai from "./Pages/Pegawai"

export default class App extends Component {
  render() {
    return (
      <Routes>      
        <Route path='/' element={<Main/>}/>
        <Route path='/pegawai' element={<Pegawai/>}/>
        {/* <Route path='/test' element={<Test/>}/> */}
      </Routes>
    )
  }
}