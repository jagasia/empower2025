import { useEffect, useState } from "react";
import UserService from "../services/UserService";

export const Login = () => {
    const [user, setUser] = useState({username:'', password:''});
    const [roles, setRoles] = useState([]);

    useEffect(()=>{

    },[roles])

    const fnLogin = () => {
        UserService.fnLogin(user).then((response)=>{
            console.log(response.data)
            
            const roles = response.data.authorities.map(auth => auth.authority);

            setRoles(roles);
            //store the response in localStorage
            localStorage.setItem("user", JSON.stringify(response.data));
            
        }).catch((error)=>{
            console.log(error)
            
            setRoles([]);
        })
    }   
    return (        
        <div>            
            Username: <input type="text" name="username" className="form-control" onChange={(e)=>setUser({...user,"username":e.target.value})} /> <br />
            Password: <input type="password" name="password" className="form-control" onChange={(e)=>setUser({...user,"password":e.target.value})}  /> <br />
            <button onClick={fnLogin} className="btn btn-info">Login</button>  
            <br/>
            {roles.length>0 && <div className="alert alert-success mt-3">Login Successful. Roles: {roles.join(", ")}</div>}
        </div>
    )
}   