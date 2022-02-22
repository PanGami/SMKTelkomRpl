import React, {Component} from 'react';  
class Alert extends Component {  
  render(){  
    return (  
      <div className={"alert alert-" + this.props.type}>  
        <h4>{this.props.header}</h4>  
        {this.props.children}  
      </div>  
    );  
  }  
}  
export default Alert;  

// class Alert extends Component {  
//   render(){  
//     return (  
//       <div className={"alert alert-" + this.props.type}>  
//         <hr />  
//         <h4>Alert Control</h4>  
//         <b className="text-left">Tipe Alert</b>  
//         <select className="form-control" name="type" value={this.state.type}  
//           onChange={this.changeTypeAlert}>  
//           <option value="success">Success</option>  
//           <option value="warning">Warning</option>  
//           <option value="danger">Danger</option>  
//           <option value="info">Info</option>  
//         </select>  
//         <b className="text-left">Header Alert</b>  
//         <input  
//           type="text" name="header" className="form-control" value={this.state.header}  
//           onChange={this.changeHeaderAlert} />  
//         <b className="text-left">Content Alert</b>  
//         <input  
//           type="text" name="content" className="form-control" value={this.state.content}  
//           onChange={this.changeContentAlert} />  
//       </div>  
//     );  
//   }  
// }  
// export default Alert;  