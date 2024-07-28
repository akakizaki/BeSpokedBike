import React, { useEffect, useState } from 'react';

const BikesList = () => {
  const [bikes, setBikes] = useState([]);

  useEffect(() => {
    // Fetch the products from the backend
    fetch('/api/bikes')
      .then(response => response.json())
      .then(data => setBikes(data))
      .catch(error => console.error('Error fetching products:', error));
  }, []);

  return (
    <div>
      <h1>Bikes</h1>
      <ul>
        {bikes.map(bikes => (
          <li key={bikes.id}>
            {bikes.name} - {bikes.manufacturer} - ${bikes.saleprice}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BikesList;
