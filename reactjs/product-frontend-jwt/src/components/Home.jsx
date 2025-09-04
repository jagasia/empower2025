import { useEffect, useState } from "react";
import TestService from "../services/TestService";

export const Home = () => {

    const [message, setMessage] = useState("Anything");
    useEffect(()=>{
        TestService.fnHome().then((response)=>{
            console.log(response.data)
            setMessage(response.data);
        }).catch((error)=>{
            console.log(error)
        })
    },[])


    return (
        <div>
            <h1>Home Component</h1>
            <h2>{message}</h2>
        </div>
    )
}   