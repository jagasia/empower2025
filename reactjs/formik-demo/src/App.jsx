import { Route, Routes } from "react-router-dom"
import { Login } from "./components/Login"
import { Logout } from "./components/Logout"
import { Nav } from "./components/Nav"
import { Product } from "./components/Product"
import { Signup } from "./components/Signup"
import { EditProduct } from "./Editproduct"
import { Home } from "./Home"

export const App = () => {
  
return <div>

    <Nav />
    <div className="p-5 bg-info">
      <h1 className="text-center font-bold underline">
        Product Form using Formik
      </h1>
    </div>
    <div className="row">
      <div className="col-md-4">
      </div>
      <div className="col-md-4">
        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/signup" element={<Signup />} />
          <Route path="/product" element={<Product />} />
          <Route path="/editproduct/:id" element={<EditProduct />} />
          <Route path="/logout" element={<Logout />} /> 
          <Route path="/" element={<Home />} />  
          <Route path="*" element={<h2 className="text-center">404 Page Not Found</h2>} />
        </Routes>
      </div>
      <div className="col-md-4">
      </div>
    </div>
  </div>
}