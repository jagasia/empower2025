import { Component } from "react";

class Maths extends Component{

    constructor(props){
        super();
        this.state={no1:0, no2:0, sum:0};
        this.addNumbers=this.addNumbers.bind(this);
    }

    addNumbers(){
        var x=this.state.no1;
        var y=this.state.no2;
        this.setState({...this.state, sum: parseInt(x)+parseInt(y)});
    }

    render(){
        return <div>
            {JSON.stringify(this.state)}<br/>
            <form>
                Number 1: <input type="text" name="num1" onChange={(e)=>this.setState({...this.state,no1:e.target.value})}/><br/>
                Number 2: <input type="text" name="num2" onKeyUp={(e)=>{this.setState({...this.state,no2:e.target.value})}} /><br/>
                <input type="button" value="Add" onClick={this.addNumbers} />      
            </form>
            { this.state.sum>0 && <div>Sum is: {this.state.sum}</div> }
        </div>
    }
}
export default Maths;