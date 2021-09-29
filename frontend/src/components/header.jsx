import React from "react";
import '../styles/header.css'
import Search from "./search";

const Header = () =>{

    return(

        <nav >
            <div className="firstheaderitem">
                Case shop
            </div>

            <div>

            <Search />

            </div>
            <ul className="secondheaderitem">
                <li>
                    Cart
                </li>
    
            </ul>
    
    
        </nav>
    
    
    
    )

}



export default Header;