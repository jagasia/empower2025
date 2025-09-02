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
      Hello world<br/>
      <Product /><br/>
      <Maths /><br/>
      <Login title="Admin Login Page" backgroundColor="pink" /><br/>
      <Login title="User Login Page" backgroundColor="lightBlue" /><br/>
      <Country />
    </div>
  )
}

export default App
