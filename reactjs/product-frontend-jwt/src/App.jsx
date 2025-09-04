import { useState } from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import { Home } from './components/Home'
import { Login } from './components/Login'
import { Nav } from './components/Nav'
import { ProductCrud } from './components/ProductCrud'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div className="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  <Nav />
<div className="container mt-5">
  <div className="row">
    <div className="col-sm-4">
      
    </div>
    <div className="col-sm-4">
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home />}></Route>
          <Route path='/product-crud' element={<ProductCrud />}></Route>
          <Route path='/login' element={<Login />}></Route>
        </Routes>
      </BrowserRouter>
    </div>
    <div className="col-sm-4">
      
    </div>
  </div>
</div>
    </>
  )
}

export default App
