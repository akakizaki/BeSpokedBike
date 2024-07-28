import logo from './logo.svg';
import './App.css';

import React from 'react';
import './App.css';
import SalesPersonList from './components/SalesPersonList';
import UpdateSalesperson from './components/updateSalesPerson';
import ProductList from './components/ProductList';
import CustomerList from './components/CustomerList';
import SalesList from './components/SalesList';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>BeSpoked Bikes Sales Tracking Application</h1>
      </header>
      <SalesPersonList /> 
      <SalesList /> 
      <ProductList /> 
      <UpdateSalesperson />
      <CustomerList />
      
    </div>
  );
}

export default App;

