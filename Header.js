import React from 'react'
import {NavBar} from './NavBar';
const links =[{"link":'/home','text':'Home'},
              {"link":'/aboutus','text':'About Us'},
              {"link":'/client','text':'Client'}
              ]
export const Header = ({heading}) => {
  return (
    <div style={{height:'750px'}}>
        <h1>{heading}</h1>

        <NavBar data={links}></NavBar>
       
    </div>
  )
}
