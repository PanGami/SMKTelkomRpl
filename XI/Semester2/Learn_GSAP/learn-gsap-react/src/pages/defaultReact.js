import logoReact from "../assets/react.svg";
import logoGsap from "../assets/gsap.svg";
import "../styles/App.css";
import '../scripts/default.js'
import { Link } from "react-router-dom";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logoReact} className="App-logo" alt="logo" />
        <img src={logoGsap} className="gsap-logo" alt="logo" />
      </header>
      <Link style={{ textDecoration: 'none' }} to='/'><h3 className="text">GET STARTED</h3></Link>
    </div>
  );
}

export default App;
