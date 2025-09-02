import { useState } from 'react'
import './App.css'

import { Country } from './components/Country'
import { Login } from './components/Login'
import Maths from './components/Maths'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      Hello world<br/>
      <Maths /><br/>
      <Login /><br/>
      <Country />
    </div>
  )
}

export default App
