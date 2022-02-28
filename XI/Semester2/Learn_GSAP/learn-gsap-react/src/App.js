import React, { Component } from "react";
import {Routes, Route} from "react-router-dom";

// import Test from "./pages/test"
import Main from "./pages/defaultReact"

export default class App extends Component {
  render() {
    return (
      <Routes>      
        <Route path='/' element={<Main/>}/>
        {/* <Route path='/' element={<Pegawai/>}/> */}
        {/* <Route path='/test' element={<Test/>}/> */}
      </Routes>
    )
  }
}