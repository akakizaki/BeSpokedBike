import React, { useEffect, useState } from 'react';

const SalespersonList = () => {
  const [salespersons, setSalespersons] = useState([]);

  useEffect(() => {
    // Fetch the salespersons from the backend
    fetch('http://localhost:8080/api/salespersons')
      .then(response => response.json())
      .then(data => setSalespersons(data))
      .catch(error => console.error('Error fetching salespersons:', error));
  }, []); // Add empty dependency array here

  return (
    <div>
      <h1>Salespersons</h1>
      <ul>
        {salespersons.map(salesperson => (
          <li key={salesperson.id}>
            {salesperson.firstName} {salesperson.lastName}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default SalespersonList;




