import { useEffect, useState } from "react";
import ProductService from "../services/ProductService";

export const ProductCrud = () => {
    const [products, setProducts] = useState([]);
    const [product, setProduct] = useState({ id: '', name: '', category: '', price: '', photo:'' });

    useEffect(() => {
        ProductService.fnGetAllProducts().then((response) => {
            console.log(response.data)
            setProducts(response.data);
        }).catch((error) => {
            console.log(error)
        })
    }, [])

    function fnAdd() {
        console.log("Adding product: ", product);
        alert("Adding product: " + JSON.stringify(product));
        
        ProductService.fnAddProduct(product).then((response) => {
            console.log("Response from api (adding):"+response.data)
            alert("Response from api (adding):"+JSON.stringify(response.data))
            //add the new product to products array
            setProducts([...products, response.data]);
        }).catch((error) => {
            console.log(error)
            alert("You need to login first: "+error);
        })
    }
    function fnUpdate() {
    }
    function fnDelete() {
    }


    function readFileDataAsBase64(e) {
    const file = e.target.files[0];
    return new Promise((resolve, reject) => {
      const reader = new FileReader();
      reader.onload = (event) => {
        resolve(event.target.result);
      };
      reader.onerror = (err) => {
        reject(err);
      };
      reader.readAsDataURL(file);
    });
  }
    function readPhoto(e) {
    readFileDataAsBase64(e)
      .then((data) => {
        if(data.length>10000000){
            alert("File size should be less than 10MB");
            return;
        }
        setProduct({ ...product, "photo": data });
      })
      .catch((error) => {

      })
  }

    

    return (
        <div>
            {JSON.stringify(product)}
            <h1>Product CRUD Component</h1>
            <form>
                Id: <input type="text" name="id" className="form-control" onChange={(e) => setProduct({ ...product, "id": e.target.value })} /> <br />
                Name: <input type="text" name="name" className="form-control" onChange={(e) => setProduct({ ...product, "name": e.target.value })} /> <br />
                Category: <input type="text" name="category" className="form-control" onChange={(e) => setProduct({ ...product, "category": e.target.value })} /> <br />
                Price: <input type="text" name="price" className="form-control" onChange={(e) => setProduct({ ...product, "price": e.target.value })} /> <br />
                Photo: <input type="file" name="photo" className="form-control" onChange={readPhoto} /> 
                <img src={product.photo} width={100} alt="Image not supported" />
                <br />
                <button className="btn btn-primary" onClick={fnAdd}>Add</button>&nbsp;
                <button className="btn btn-warning" onClick={fnUpdate}>Update</button>&nbsp;
                <button className="btn btn-danger" onClick={fnDelete}>Delete</button>

            </form>
            <br /><br />
            <table className="table table-bordered table-striped table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Category</th>
                        <th>Price</th>
                        <th>Photo</th>
                    </tr>
                </thead>
                <tbody>
                    {products.map((prod) =>
                        <tr key={prod.id}>
                            <td>{prod.id}</td>
                            <td>{prod.name}</td>
                            <td>{prod.category}</td>
                            <td>{prod.price}</td>
                            <td>
                                <img src={prod.photo} width={100} alt="Image not supported" />
                            </td>
                        </tr>
                    )}
                </tbody>
            </table>
        </div>
    )
}