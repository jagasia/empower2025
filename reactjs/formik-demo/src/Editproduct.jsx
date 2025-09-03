import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

export const EditProduct=()=>{
    const param = useParams();
    const [id, setId] = useState();

    useEffect(()=>{
        setId(param.id);
    },[])

    return <div>
        <h2 className="text-center">Edit Product Form</h2>    
        {id && <h3 className="text-center">Product ID is {id}</h3>}
    </div>
}