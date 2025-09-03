export const Login = () => {
  
return <div>
        <h2 className="text-center">Login Form</h2>
        <form>
          Username: <input type="text" className="form-control" />
          Password: <input type="password" className="form-control" />
          <br />
          <input type="button" value="Login" className="btn btn-info" onClick={()=>alert('hi')} />
        </form>
  </div>
}       