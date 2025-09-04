import axios from "axios";

class TestService{

    fnHome(){
        return axios.get("http://localhost:8084/api/v1");
    }
}

export default new TestService();