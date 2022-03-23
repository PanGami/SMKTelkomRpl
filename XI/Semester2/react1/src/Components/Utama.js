import React from 'react';
import {Routes, Route} from 'react-router-dom';

import '../style.css'
import Nol from '../App0';
import Satu from '../App'
import Dua from '../App2';
import List from './List'
import ListGallery from './ListGallery';
import Cart from '../Cart';

export default class Utama extends React.Component {
    render() {
      return (
        <Routes>        
            <Route exact path='#' element={<Satu/>}/>
            <Route path='/Belakang' element={<Nol/>}/>
            <Route path='/Depan' element={<Dua/>}/>        
            <Route path='/List' element={<List/>}/>            
            <Route path='/Gallery' element={<ListGallery/>}/>
            <Route path='/Cart' element={<Cart/>}/>
        </Routes>
        )
    }
}