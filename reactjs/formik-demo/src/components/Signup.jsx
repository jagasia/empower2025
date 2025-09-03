export const Signup = () => {
  
return <div>
        <h2 className="text-center">Signup Form</h2>
        <form>
          Username: <input type="text" className="form-control" />
          Email: <input type="email" className="form-control" />
          Password: <input type="password" className="form-control" />
          Confirm Password: <input type="password" className="form-control" />
          <br />
          <input type="button" value="Signup" className="btn btn-info" onClick={()=>alert('hi')} />
        </form>
  </div>
}           