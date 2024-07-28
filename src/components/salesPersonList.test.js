// src/components/SalespersonList.test.js
import React from 'react';
import { render, screen } from '@testing-library/react';
import SalespersonList from './SalesPersonList';

test('renders Salespersons heading', () => {
  render(<SalespersonList />);
  const headingElement = screen.getByText(/Salespersons/i);
  expect(headingElement).toBeInTheDocument();
});
