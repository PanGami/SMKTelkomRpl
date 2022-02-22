import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import App from './App';
import Contact from './subPages/Contact';
import Animate from './components/styles/animate';

ReactDOM.render(
  
  <Router>
    <Routes>
      <Route path='/' element={<App/>}/>
      <Route path='/contact' element={<Contact/>}/>
    </Routes>
  </Router>,

  document.getElementById('root')
);
