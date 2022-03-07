import React, {Component} from 'react';    
import './style.css';
import { Link } from 'react-router-dom';

class App0 extends Component {  
  render(){  
    return (  
      <div className="App container">  
        <div className="alert alert-info">  
          <h3 className="text-danger">Ini Project Pertama React JS</h3>  
          <p>Belajar React JS itu mudah</p>  
          <button className="mr-1 btn btn-success">Setuju</button>  
          <button className="btn btn-info">Iya Dong</button>  
          <Link to="/List" className="mr-1 btn btn-success">Menuju List</Link>
        </div>  
      </div>  
    );  
  }  
}  
export default App0;  