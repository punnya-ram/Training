import React from 'react'
import { AddDriver } from './AddDriver'
import { FetchData } from './FetchData'

export const CrudComponent = () => {
    const[driverList,setDriverList]=useState([]);

  return (
    <div>
        <FetchData></FetchData>
        <AddDriver></AddDriver>
    </div>
  )
}
