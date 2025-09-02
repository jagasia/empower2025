import { useState } from "react";



export const Login=(props)=>{
    const [username, setUsername]=useState("");
    const [password, setPassword]=useState(""); 
    const [result, setResult]=useState(""); 
    const [showPassword, setShowPassword]=useState(true);
    
    function doLogin(e){
        
        if(username==="admin" && password==="admin"){
            setResult("Login Successful");
        } else {
            setResult("Login Failed");
        }
    }   


    return <div style={{backgroundColor:props.backgroundColor, padding:'10px', border:'2px solid black', inlineSize:'300px'}}>
        {username}
        <br/>
        {password}
        <h2>{props.title}</h2>
        <form>
            Username: <input type="text" name="username" onChange={(e)=>setUsername(e.target.value)} className="form-control" /><br/>
            Password: <input type={(showPassword)?'text':'password'} name="password" onChange={(e)=>setPassword(e.target.value)} className="form-control"  /><br/>
            Show Password: <input type="checkbox" checked={showPassword} onChange={(e)=>setShowPassword(e.target.checked)} /><br/>
            <input type="button" value="Login" onClick={doLogin} />   
        </form>
        { result.length>0 && <div style={{color:(result==='Login Successful')?'green':'red'}}>{result}</div> }
    </div>
}
