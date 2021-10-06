import React, {useState, useEffect} from "react";


export default function Products({ setCart, cart}){
    const [shells, setShells] = useState([]);
    const [models, setModels] = useState([]);
    const [term, setTerm] = useState("")
    const [termResults, setTermResults] = useState ([])

    useEffect(()=> {
        getData();

        async function getData() {
            const response = await fetch ("http://localhost:8080/rest/shell")
            const data = await response.json();
            setShells(data);        
        }
    }, []);



    const handleChange = event => {
        setTerm(event.target.value);
    };




    useEffect(()=>{
        const results = shells.filter(o=> o.name.toUpperCase().toLowerCase().includes(term));
        setTermResults(results);

    }, [term]);

    const renderItems = termResults.map((shell, index) => { return( <div  className="listItems" key={index} shell={JSON.stringify(shell)}>{shell.name}<button type="button" onClick={() => addToCart(shell)}>ADD</button></div>)})


        const addToCart = (product) => {
            let newCart = [...cart];
            let itemInCart = newCart.find(
              (item) => product.name === item.name
            );
            if (itemInCart) {
              itemInCart.quantity++;
            } else {
              itemInCart = {
                ...product,
                quantity: 1,
              };
              newCart.push(itemInCart);
            }
            setCart(newCart);
          };

    return (
        <>
            <form>
                <input className="search" placeholder="search for a phone.."  type="text" onChange={handleChange} value={term} />          
            </form>
            <div className="products">
                {renderItems}
            </div>
        </> );

}