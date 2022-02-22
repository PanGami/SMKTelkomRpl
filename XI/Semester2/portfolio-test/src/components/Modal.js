import { Link } from 'react-router-dom';
import React from 'react';
import './styles/Modal.css'
import { Close } from '@material-ui/icons';

const Modal = ({showModal}) => {
  return (
        <div className='modal'>

            <div className="close-modal">
                <Close className='cm' onClick={showModal}/>
            </div>
            
            <div className="cart">
                <Link to='/'>Websites</Link>
            </div>

            <div className="cart">
            <Link to='/'>Designs</Link>
            </div>

            <div className="cart">
            <Link to='/'>Templates</Link>
            </div>

            <div className="cart">
            <Link to='/'>Web Apps</Link>
            </div>
        </div>
  );
};

export default Modal;
