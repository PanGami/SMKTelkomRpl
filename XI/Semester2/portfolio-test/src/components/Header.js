import { Close, MenuOutlined } from "@material-ui/icons";
import React, { useState } from "react";
import { Link } from "react-router-dom";
import "./styles/Header.css";

const Header = () => {
  const [active, setActive] = useState(false);

  const showHam = () => {
    setActive(!active);
  };

  return (
    <div className="header">
      <div className="logo">
        <span>Pan.</span>
      </div>

      <nav>
        <ul className={active ? "list-items active" : "list-items"}>
          <div className="close-icon">
            <Close className="close" onClick={showHam} />
          </div>
          <li>
            <Link to="/">Works</Link>
          </li>
          <li>
            <Link to="/">Projects</Link>
          </li>
          <li>
            <Link to="/">About</Link>
          </li>
          <li>
            <Link to="/contact">Contact</Link>
          </li>
        </ul>
      </nav>

      <div className="menu-icon">
        <MenuOutlined className="icon" onClick={showHam} />
      </div>
    </div>
  );
};

export default Header;
