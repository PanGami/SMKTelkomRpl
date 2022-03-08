import React, {Component} from 'react';    
import './style.css'; 
import Media from './Components/Media';  
import foto from './image/sat.jpg';
import { Link } from 'react-router-dom';
import Utama from './Components/Utama';
import SosialIcon from './Components/socialicons/index'
import Gallery from './Components/ListGallery.js';

class App extends Component {
  render(){
    return(      
      <div className='all'>
          <h4>BELAJAR REACT.JS</h4>
          <SosialIcon/>
          <div className="test">                             
              <img src={foto} class="img-responsive" title="Test"/>                                                                               
          </div> 
          <div className="test">
            <Link className="btn btn-success" to="/Belakang">Test Router</Link>          
            <Link className="btn btn-info" to="/Depan">Test Router</Link>     
          </div>       
          <p><Utama/></p>
          <Gallery/>
          <a href="#"><i class="arrow fas fa-gem me-3"></i></a>          
            <div className='test'>
              <Media image="Michael.png" title="React Test">  
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis  Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis 
              </Media>  
              <Media image="dua.jpg" title="React Test">  
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis  Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis   
              </Media>
              <Media image="Michael.png" title="React Test">  
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis  Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis 
              </Media>  
              <Media image="dua.jpg" title="React Test">  
                Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis  Cras sit amet nibh libero, in gravida nulla. Nulla vel metus  
                scelerisque ante sollicitudin. Cras purus odio, vestibulum  
                in vulputate at, tempus viverra turpis   
              </Media>
            </div>           
      </div>
    );
  }
}
export default App;