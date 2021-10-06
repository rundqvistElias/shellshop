import React, {useState, useEffect} from 'react';
import './App.css'
import Products from './pages/Products';
import Cart from './pages/Cart';

  const PAGE_CART = 'cart';
  const PAGE_PRODUCTS = 'products';
  function App() {

  const [cart, setCart] = useState([]);
  const [page, setPage] = useState(PAGE_PRODUCTS);

  const navigateTo = (nextPage) => {
    setPage(nextPage);
  };


  const getCartTotal = () => {
    return cart.reduce(
      (sum, { quantity }) => sum + quantity,
      0
    );
    }


  return (
    <div className="App">
      <header className="caseHeader">

        <button className="secondHeaderItem" onClick={() => navigateTo(PAGE_PRODUCTS)}>
          View Products
        </button>

        <button className="firstHeaderItem" onClick={() => navigateTo(PAGE_CART)}>
          Go to Cart ({getCartTotal()})
        </button>
              
      </header>
      {page === PAGE_PRODUCTS && (
        <Products cart={cart} setCart={setCart} />
      )}
      {page === PAGE_CART && (
        <Cart cart={cart} setCart={setCart} />
      )}
    </div>
    
    
  )
}

export default App
