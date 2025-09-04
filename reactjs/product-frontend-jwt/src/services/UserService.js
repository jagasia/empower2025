import axios from "axios";

class UserService{
    URL='http://localhost:8084/api/v2';

    fnLogin(ar){
        return axios.post(this.URL+"/login", ar);
    }
}

export default new UserService();