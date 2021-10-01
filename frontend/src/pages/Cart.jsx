import React from "react";

export default function cart({cart, setCart}) {
   
    
    const clearCart = () => {
        setCart([])
    };




    return (
        <>
          <h1>Cart</h1>
          {cart.length > 0 && (
            <button onClick={clearCart}>Clear Cart</button>
          )}
          <div className="products">
            {cart.map((shell, index) => (
              <div className="product" key={index}>
                <h3>{shell.name}</h3>
                
                <input
                  value={shell.quantity}
                  onChange={(e) =>
                    setQuantity(
                      product,
                      parseInt(e.target.value)
                    )
                  }
                />
                <button onClick={() => removeFromCart(product)}>
                  Remove
                </button>
              </div>
            ))}
          </div>
    
        </>
      );

}