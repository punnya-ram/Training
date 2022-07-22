import React from 'react'

export const ShowData = (props) => {
  return (
    <div>
  
      <table  className='table table-striped'>
        <thead>
          <tr>
            <th>Driver Id</th>
            <th>Driver name </th>
            <th>Mobile Number </th>
            <th>Location </th>
            <th>DateOfBirth </th>
            <th>Rating </th>
          </tr>
        </thead>
        <tbody>
          {
             props.data.map( (element,idx) => {
              return <tr key={idx}>
              <td>{element.driverId}</td>
              <td>{element.driverName}</td>
              <td>{element.mobileNumber}</td>
              <td>{element.location}</td>
              <td>{element.dateOfBrith}</td>
              <td>{element.rating}</td>
              </tr>
          })
      }
  </tbody>

</table>
</div>
)
}

