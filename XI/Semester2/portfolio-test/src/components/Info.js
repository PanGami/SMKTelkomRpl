import React from 'react';
import { Link } from 'react-router-dom';
import './styles/Info.css'

const Info = () => {
  return (
            <div className='info-section'>

                <div className="info-about">
                    <h3>About <span>Pan</span></h3>
                    <p className='info-about-status'>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Autem quia saepe aliquam commodi quae excepturi expedita reiciendis possimus corporis totam ipsum soluta velit vero quas ex mollitia fugit, necessitatibus assumenda. Quidem, expedita itaque! Et repellendus quisquam magnam, tempora vel perspiciatis non consequuntur alias dolor consequatur tempore debitis dignissimos magni est, aliquid aut iusto minima mollitia quam totam ab ad assumenda amet iste. Quo optio ipsam libero.
                    </p>
                    <div className="info-btn">
                        <Link to='/'>More</Link>
                    </div>
                </div>


                <div className="info-content">
                <h1>Who is Pan? </h1>
                <p>Ordinary Student</p>
                <p>Fullstack Dev</p>
                <p>Junior Dev</p>
                <p>JavaScript Developer</p>
                <p>Web Developer</p>
                <p>Something Creator in Something Company</p>
                <p>1+ years of experience in Programming</p>
                </div>
            </div>
        );
};

export default Info;
