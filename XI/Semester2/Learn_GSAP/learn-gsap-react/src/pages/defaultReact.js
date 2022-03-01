import logoReact from "../assets/react.svg";
import logoGsap from "../assets/gsap.svg";
import "../styles/App.css";
import '../scripts/default.js'
import { Link } from "react-router-dom";
import Table from "../components/table.js";

function App() {
  return (
    <div className="App">
      <Link style={{ textDecoration: 'none' }} to='/'><h3 className="text">GITHUB</h3></Link>
      <header className="App-header">
        <img src={logoReact} className="App-logo" alt="logo" />
        <img src={logoGsap} className="gsap-logo" alt="logo" />
      </header>
      
      <Table />
    </div>
  );
}

export default App;
