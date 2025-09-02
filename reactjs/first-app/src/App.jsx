import { useState } from 'react'
import './App.css'

import { Login } from './components/Login'
import Maths from './components/Maths'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div>
      Hello world<br/>
      <Maths /><br/>
      <Login />
    </div>
  )
}

export default App
