import React, { useState } from 'react';
import axios from '../axios';

const UpdateSalesperson = ({ salespersonId }) => {
  const [salesperson, setSalesperson] = useState({
    firstName: '',
    lastName: '',
    address: '',
    phone: '',
    startDate: '',
    terminationDate: '',
    manager: '',
  });

  const handleChange = (e) => {
    setSalesperson({ ...salesperson, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.put(`/salespersons/${salespersonId}`, salesperson)
      .then(response => {
        console.log('Salesperson updated:', response.data);
      })
      .catch(error => {
        console.error('Error updating salesperson:', error);
      });
  };

  return (
    
    <form onSubmit={handleSubmit}>
      <input type="text" name="firstName" value={salesperson.firstName} onChange={handleChange} placeholder="First Name" />
      <input type="text" name="lastName" value={salesperson.lastName} onChange={handleChange} placeholder="Last Name" />
      <input type="text" name="address" value={salesperson.address} onChange={handleChange} placeholder="Address" />
      <input type="text" name="phone" value={salesperson.phone} onChange={handleChange} placeholder="Phone" />
      <input type="date" name="startDate" value={salesperson.startDate} onChange={handleChange} placeholder="Start Date" />
      <input type="date" name="terminationDate" value={salesperson.terminationDate} onChange={handleChange} placeholder="Termination Date" />
      <input type="text" name="manager" value={salesperson.manager} onChange={handleChange} placeholder="Manager" />
      <button type="submit">Update Salesperson</button>
    </form>
  );
};

export default UpdateSalesperson;

