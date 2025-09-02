import { useState } from "react";

export const Country=()=>{
    const [countries, setCountries]=useState([]);
    const [country, setCountry]=useState("");
    return <div>
        <div>Country Component</div>
        Enter a country: <input type="text" name="country" onChange={(e)=>setCountry(e.target.value)} />
        <input type="button" value="Add" onClick={(e)=>{ setCountries([...countries,country])   }} /><br/>
        List of countries you have added:
        <br/>
        <ol>
            {countries.map((c)=><li>{c}</li>)}
        </ol>
    </div>
}   