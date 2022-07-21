import React from 'react'


export const Footer = ({footer,email}) => {
    const {mail,text} =email;
   // let{data} =props;
  return (
    <div>
        
    <hr></hr>
        <h1>{footer}</h1>
    
        <p><a href={'mailTo:'+mail}>{text}</a></p>
        
        
    </div>
  )
}
