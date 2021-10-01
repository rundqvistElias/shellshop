import React from "react";
import '../styles/header.css'


const Header = () =>{

    return(

        <nav >
           
           <header>
        <button onClick={() => navigateTo(PAGE_CART)}>
          Go to Cart ({getCartTotal()})
        </button>

        <button onClick={() => navigateTo(PAGE_PRODUCTS)}>
          View Products
        </button>
      </header>
      {page === PAGE_PRODUCTS && (
        <Products cart={cart} setCart={setCart} />
      )}
      {page === PAGE_CART && (
        <Cart cart={cart} setCart={setCart} />
      )}

    
        </nav>
    
    
    
    )

}



export default Header;