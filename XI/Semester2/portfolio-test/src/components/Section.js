import React, { useState } from "react";
import "./styles/Section.css";
import { Link } from "react-router-dom";
import Modal from "./Modal";

const Section = () => {
  const [modalActive, setModalActive] = useState(false);

  const showModal = () => {
    setModalActive(!modalActive);
  };

  return (
    <div className="main">
      <div>
        <h1 className="main-header">
          Hey my name is <span>Panca Nugraha</span>{" "}
        </h1>
        <p className="main-status">
          Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vitae
          corrupti nisi error et eligendi temporibus quo est obcaecati illum?
          Consequatur sequi tempore quaerat fugit? Quisquam ducimus excepturi at
          eius libero.
        </p>
        <div className="main-btn">
          <Link onClick={showModal} to="/">
            see work
          </Link>
        </div>

        {modalActive && <Modal showModal={showModal} />}
      </div>
    </div>
  );
};

export default Section;
