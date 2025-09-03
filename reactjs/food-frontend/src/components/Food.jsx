import { useFormik } from "formik";
import { useEffect, useState } from "react";
import * as Yup from "yup";
import FoodService from "../services/FoodService";

export const Food = () => {
    const [foods, setFoods] = useState([]);
    const [status, setStatus] = useState("");

    useEffect(() => {
        //fetch all foods
        FoodService.retrieveAllFoods()
            .then(response => {
                console.log("Data fetched successfully", response.data);
                setFoods(response.data);
            })
            .catch(error => {
                console.error("Error fetching data", error);
            });
    }, []);

    const formik = useFormik({
        initialValues: {
            id: 0,
            name: "",
            price: 0,
            category: ""
        },
        validationSchema: Yup.object({
            id: Yup.number().min(1, "Min 1").required("Required"),
            name: Yup.string().min(3, "Min 3").required("Required"),
            price: Yup.number()
                .min(1, "Min 1")
                .max(1000, "Max 1000")
                .required("Required"),
            category: Yup.string()
                .min(3, "Min 3")
                .max(20, "Max 20")
                .required("Required")
        })
    });

    function fnAdd() {
        // alert("Adding: " + JSON.stringify(formik.values, null, 2));
        //call the service method to add
        FoodService.addFood(formik.values)
            .then(response => {
                console.log("Food added successfully", response.data);
                setStatus("Added");
            })
            .catch(error => {
                console.error("Error adding food", error);
            });
    }
    function fnUpdate() {
        alert("Updating: " + JSON.stringify(formik.values, null, 2));   
        FoodService.updateFood(formik.values)
        .then(res=>{
            console.log(res);
            
        })
        .catch(err=>{

        })
    }



    function fnDelete() {
        alert("Deleting: " + JSON.stringify(formik.values, null, 2));
        FoodService.deleteFood(formik.values.id)
        .then(res=>{
            console.log(res);
            
        })
        .catch(err=>{
            console.log("Error while deleting: "+err);
            
        })
    }

    return (
        <div>
            <div className="row">
                <div className="col-sm-2"> </div>
                <div className="col-sm-6 text-left">
                    <h3 className="text-center">Food Component</h3>
            <form className="text-left">
                <div className="mb-3">
                    <label htmlFor="id" className="form-label">ID</label>
                    <input
                        type="number"
                        className="form-control"
                        id="id"
                        name="id"
                        onChange={formik.handleChange}
                        onBlur={formik.handleBlur}
                        value={formik.values.id}
                    />
                    {formik.touched.id && formik.errors.id ? (
                        <div className="text-danger">{formik.errors.id}</div>
                    ) : null}
                </div>

                <div className="mb-3">
                    <label htmlFor="name" className="form-label">Name</label>
                    <input
                        type="text"
                        className="form-control"
                        id="name"
                        name="name"
                        onChange={formik.handleChange}
                        onBlur={formik.handleBlur}
                        value={formik.values.name}
                    />
                    {formik.touched.name && formik.errors.name ? (
                        <div className="text-danger">{formik.errors.name}</div>
                    ) : null}
                </div>

                <div className="mb-3">
                    <label htmlFor="price" className="form-label">Price</label>
                    <input
                        type="number"
                        className="form-control"
                        id="price"
                        name="price"
                        onChange={formik.handleChange}
                        onBlur={formik.handleBlur}
                        value={formik.values.price}
                    />
                    {formik.touched.price && formik.errors.price ? (
                        <div className="text-danger">{formik.errors.price}</div>
                    ) : null}
                </div>

                <div className="mb-3">
                    <label htmlFor="category" className="form-label">Category</label>
                    <input
                        type="text"
                        className="form-control"
                        id="category"
                        name="category"
                        onChange={formik.handleChange}
                        onBlur={formik.handleBlur}
                        value={formik.values.category}
                    />
                    {formik.touched.category && formik.errors.category ? (
                        <div className="text-danger">{formik.errors.category}</div>
                    ) : null}
                </div>

                <input type="button" className="btn btn-primary" value="Add" onClick={fnAdd} />&nbsp;
                <input type="button" className="btn btn-secondary" value="Update" onClick={fnUpdate} />&nbsp;
                <input type="button" className="btn btn-danger" value="Delete" onClick={fnDelete} />&nbsp;
                <input type="button" className="btn btn-info" value="Clear" />
            </form>
                     </div>
                <div className="col-sm-2"> </div>
            </div>
            <table className="table table-bordered table-striped table-hover">
                <thead>
                    <tr>
                        <th>Id</th><th>Name</th><th>Category</th><th>Price</th><th></th>
                    </tr>
                </thead>
                <tbody>
                    {
                        foods.map(f =>
                            <tr key={f.id}>
                                <td>{f.id}</td>
                                <td>{f.name}</td>
                                <td>{f.category}</td>
                                <td>{f.price}</td>
                                <td>
                                    <button className="btn btn-sm btn-info">Edit</button>
                                </td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>
    );
};
