import logo from '../Assets/logo.svg';
import '../Styles/App.css';
import {Link} from "react-router-dom";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Link to="/pegawai"><img src={logo} className="App-logo" alt="logo"/></Link>
      </header>
    </div>
  );
}

export default App;
