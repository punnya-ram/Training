import React from 'react'
import {NavBar} from './NavBar';
import {Image} from './Image';
import logo from'./images/logo.jpg';
import { computeHeadingLevel } from '@testing-library/react';


const links =[{"link":'/home','text':'Home'},
              {"link":'/aboutus','text':'About Us'},
              {"link":'/client','text':'Client'}
              ]
export const Header = ({heading}) => {
  return (
    <header>
    <div className='col-md-6' style={{height:'200px'}}>
    
        <h1> {heading}</h1>
        <Image imgRef={logo} altText={'company logo'}></Image>
        </div>

        <div className='col-md-6'>
        <NavBar data={links}></NavBar>
        </div>

    </header>
    
  )
}

