import React, {Component} from 'react';    
import './style.css';
import Alert from './Components/Alert';  

class App2 extends Component { 
  // constructor(){  
  //   // fungsi untuk mengubah tipe  
  //   const changeTypeAlert = (event) =>{  
  //     this.setState({type: event.target.value});  
  //   }  
  //   // fungsi untuk mengubah header  
  //   const changeHeaderAlert = (event) => {  
  //     this.setState({header: event.target.value});  
  //   }  
  //   // fungsi untuk mengubah content  
  //   const changeContentAlert = (event) => {  
  //     this.setState({content: event.target.value});  
  //   }  

  //   super();  
  //   this.state = {  
  //     type: "danger",  
  //     header: "Fatal Error",  
  //     content: "ini content dari alert"  
  //   }  
  // }  

  render(){  
    return (  
      // <Alert type={this.state.type} header={this.state.header}>  
      //     {this.state.content}  
      // </Alert>  
      <div className="App container col-sm-10">  
        <Alert type="danger" header="Fatal Error">  
          Ini adalah alert dengan tipe danger  Ini adalah alert dengan tipe danger Ini adalah alert dengan tipe danger Ini adalah alert dengan tipe danger Ini adalah alert
        </Alert>  
        <Alert type="success" header="Berhasil">  
          Ini adalah alert dengan tipe success Ini adalah alert dengan tipe success Ini adalah alert dengan tipe success Ini adalah alert dengan tipe success  
        </Alert>  
        <Alert type="warning" header="Warning">  
          Ini adalah alert dengan tipe warning Ini adalah alert dengan tipe warning  Ini adalah alert dengan tipe warning  Ini adalah alert dengan tipe warning Ini adalah alert dengan tipe warning  
        </Alert>  
      </div>  
    );   
  }  
}  
export default App2; 
