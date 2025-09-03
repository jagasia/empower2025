import axios from "axios";

class FoodService {
    URL = 'http://localhost:5000/food';

    retrieveAllFoods() {
        return axios.get(this.URL);
    }

    addFood(food) {
        return axios.post(this.URL, food);
    }

    updateFood(food) {
        return axios.put(`${this.URL}/${food.id}`, food);
    }

    deleteFood(id) {
        return axios.delete(`${this.URL}/${id}`);
    }


}

export default new FoodService();