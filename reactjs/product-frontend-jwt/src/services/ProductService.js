import axios from "axios";

class ProductService{
    URL='http://localhost:8084/api/v3/product';

    fnGetAllProducts(){
        var user=localStorage.getItem("user");
        if(user){
            user=JSON.parse(user);
            return axios.get(this.URL,{headers: {'Authorization': 'Bearer '+user.jwtToken}}   );
        }else{
            //not logged in..... throw error
            throw new Error("User not logged in");
        }
        
    }

    fnAddProduct(product){
        var user=localStorage.getItem("user");
        if(user){
            user=JSON.parse(user);
            return axios.post(this.URL,product,{headers: {'Authorization': 'Bearer '+user.jwtToken}}   );
        }else{
            //not logged in..... throw error
            throw new Error("User not logged in");
        }
        
    }

    fnUpdateProduct(ar){
        var user=localStorage.getItem("user");
        if(user){
            user=JSON.parse(user);
            return axios.put(this.URL+"/"+ar.id,ar,{headers: {'Authorization': 'Bearer '+user.jwtToken}}   );
        }else{
            //not logged in..... throw error
            throw new Error("User not logged in");
        }
}
}
export default new ProductService();