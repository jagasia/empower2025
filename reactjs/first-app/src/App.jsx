import { useState } from 'react'
import './App.css'

import { Country } from './components/Country'
import { Login } from './components/Login'
import Maths from './components/Maths'
import { Product } from './components/Product'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      <div className="row">
        <div className="col-md-4"><Product /></div>
        <div className="col-md-4"><Login title="Admin Login Page" backgroundColor="pink" /></div>
        <div className="col-md-4"><Country /></div>
      </div>
      <br /><br /><br />
      <div className="row">
        <div className="col-md-4">
          <Maths />
        </div>
        <div className="col-md-4">
          <Login title="User Login Page" backgroundColor="lightBlue" />
        </div>
        <div className="col-md-4"></div>
      </div>
      
      <br/>
      
    </div>
  )
}

export default App
