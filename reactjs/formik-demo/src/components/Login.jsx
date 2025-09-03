import { useState } from "react";
import { useNavigate } from "react-router-dom";

export const Login = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [message, setMessage] = useState(''); 
    const navigate = useNavigate();

    function doLogin() {
        if(username === 'admin' && password === 'admin') {
            //redirect to Home
            navigate('/');
        } else {
            setMessage('Invalid Credentials');            
        }
    }
  
return <div>
        <h2 className="text-center">Login Form</h2>
        <form>
          Username: <input type="text" className="form-control" onChange={(e)=>setUsername(e.target.value)} />
          Password: <input type="password" className="form-control" onChange={(e)=>setPassword(e.target.value)} />
          <br />
          <input type="button" value="Login" className="btn btn-info" onClick={ doLogin} />
        </form>
        <div className="text-danger">{message}</div>
  </div>
}       