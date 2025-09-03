import './App.css'
import { Food } from './components/Food'

function App() {
  
  return (
    <>
      <div className='p-5 bg-primary text-center text-white'>
        <h1>Food Frontend</h1>
      </div>
      <div className="row">
        <div className="col-md-2">
          <h3>Left Side</h3>
        </div>
        <div className="col-md-8">
          <h3>
            <Food />
          </h3>
        </div>
        <div className="col-md-2">
          <h3>Right Side</h3>
        </div>  
      </div>
    </>
  )
}

export default App
