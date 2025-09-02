import { useEffect, useState } from "react";

export const Product=()=>{
    const [id, setId]=useState(0);
    const [name, setName]=useState("");
    const [category, setCategory]=useState("Electronics");
    const [price, setPrice]=useState(0);    

    useEffect(()=>{
        console.log("Page is loaded now at "+new Date());
    },[]);

    useEffect(()=>{
        console.log("Name is changed to "+name);
    },[name]);

    return <div>
        {JSON.stringify({id, name, category, price})}
        <form>
            Id: <input type="number" name="" id="" onChange={(e)=>setId(e.target.value)} className="form-control" /><br />
            Name: <input type="text" name="" id="" onChange={(e)=>setName(e.target.value)} className="form-control" /><br />
            Category: <select name="" id="" onChange={(e)=>setCategory(e.target.value)} className="form-control">
                <option value="Electronics">Electronics</option>
                <option value="Clothing">Clothing</option>
                <option value="Books">Books</option>
                <option value="Furniture">Furniture</option>
                <option value="Toys">Toys</option>  
            </select><br />
            Price: <input type="number" name="" id="" onChange={(e)=>setPrice(e.target.value)} className="form-control" /><br />
            <input type="button" value="Add" />
        </form>
    </div>
}