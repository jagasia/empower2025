import { useEffect, useState } from "react";
import ProductService from "../services/ProductService";

export const ProductCrud = () => {
    const [products, setProducts] = useState([]);
    const [product, setProduct] = useState({ id: '', name: '', category: '', price: '' });

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

    return (
        <div>
            {JSON.stringify(product)}
            <h1>Product CRUD Component</h1>
            <form>
                Id: <input type="text" name="id" className="form-control" onChange={(e) => setProduct({ ...product, "id": e.target.value })} /> <br />
                Name: <input type="text" name="name" className="form-control" onChange={(e) => setProduct({ ...product, "name": e.target.value })} /> <br />
                Category: <input type="text" name="category" className="form-control" onChange={(e) => setProduct({ ...product, "category": e.target.value })} /> <br />
                Price: <input type="text" name="price" className="form-control" onChange={(e) => setProduct({ ...product, "price": e.target.value })} /> <br />
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
                    </tr>
                </thead>
                <tbody>
                    {products.map((prod) =>
                        <tr key={prod.id}>
                            <td>{prod.id}</td>
                            <td>{prod.name}</td>
                            <td>{prod.category}</td>
                            <td>{prod.price}</td>

                        </tr>
                    )}
                </tbody>
            </table>
        </div>
    )
}