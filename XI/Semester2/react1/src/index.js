import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import 'bootstrap/dist/css/bootstrap.min.css';
// import $ from 'jquery';
// import Popper from 'popper.js';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import {BrowserRouter} from 'react-router-dom';
// import Belakang from "./App0";
// import Depan from "./App2";

ReactDOM.render(
  <BrowserRouter>    
    <App />
  </BrowserRouter>,
  document.getElementById('root')
);
