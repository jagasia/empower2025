import { useState } from "react";

export const Country=()=>{
    const [countries, setCountries]=useState([]);
    const [country, setCountry]=useState("");
    return <div>
        <form action="">
            <input type="text" name="" id="" required />
        <input type="date" name="" id="" max={'2025-09-02'} />
        <button type="submit">Submit</button>
        </form>
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