import React from 'react'
import Navi from './Navi'
import Categories from './Categories'
import ProductList from '../pages/ProductList'



export default function Dashboard() {
  return (
    <div>
      <Navi/>
      <Categories/>
      <ProductList/>
    
    </div>
  );
}
