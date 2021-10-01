import React, {useState, useEffect} from 'react';
import '../styles/case.css'
import axios from "axios";
import Search from './search';
import CaseItem from './caseitem';

const Caselist = (props) =>{
/*
    const [fetchedModels, setFetchedModels] = useState();
    useEffect(() => {
      axios
       .get("http://localhost:8080/rest/model")
       .then(response => setFetchedModels(response.data));
    }, [''])

    console.log('Models: ', fetchedModels);
*/     
        const [shells, setShells] = useState([]);
        const [term, setTerm] = useState("")
        const [termResults, setTermResults] = useState ([])
        const [cart, setCart] = useState([])


        useEffect(()=> {
            getData();

            async function getData() {
                const response = await fetch ("http://localhost:8080/rest/shell")
                const data = await response.json();


                setShells(data);
                
                console.log(data);
                
            }
        }, []);

        

       
        const handleChange = event => {
            setTerm(event.target.value);
        };


        

        useEffect(()=>{
            const results = shells.filter(o=> o.name.includes(term));
            setTermResults(results);

        }, [term]);

        
        
        
        const handleAdd = () => {
            console.log("u clicked!");
            console.log(termResults);
        }

        const addToCart = (shell) => {
            setCart([...cart, shell])
            console.log(cart);
        }


        

        const renderItems = termResults.map((shell, index) => { return( <div  className="listItems" key={index} shell={JSON.stringify(shell)}>{shell.name}<button type="button" onClick={() => addToCart(shell)}>ADD</button></div>)
    }
        )

        

    return(

        
        <div className="caselistbox">

        <div> 
            <form>
                <input className="search" placeholder="search..."  type="text" onChange={handleChange} value={term} /> 
                <button>GO to cart ({cart.length})</button>             
            </form>
        </div>
        <ul>
            {renderItems}
            
        </ul>
        </div>
    )
}


export default Caselist;