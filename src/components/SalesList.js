import React, { useEffect, useState } from 'react';

const SalesList = () => {
  const [sales, setSales] = useState([]);

  useEffect(() => {
    // Fetch the sales from the backend
    fetch('http://localhost:8080/api/sales')
      .then(response => response.json())
      .then(data => setSales(data))
      .catch(error => console.error('Error fetching sales:', error));
  }, []);

  return (
    <div>
      <h1>Sales</h1>
      <ul>
        {sales.map(sale => (
          <li key={sale.id}>
            Product: {sale.productName}, Customer: {sale.customerName}, Salesperson: {sale.salespersonName}, Date: {sale.salesDate}, Price: {sale.price}, Commission: {sale.commission}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default SalesList;
