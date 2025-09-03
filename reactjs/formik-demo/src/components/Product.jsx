import { useFormik } from "formik";
import * as Yup from 'yup';

export const Product = () => {
  const formik=useFormik({
    initialValues:{id:0, name:'', category:'', price:0},
    validationSchema:Yup.object({id:Yup.number().required("Id is mandatory"),
      name:Yup.string().required("Name is mandatory").min(3,"Product name must be atleast 3 letters"),
      category:Yup.string().required("Please choose a category"),
      price:Yup.number().required("Price is mandatory").min(0,"Price cannot be negative")
    })
  });
return <div>
        <form>
          Id: <input type="number" id="id" className={`form-control ${(formik.errors.id)?'is-invalid':''}`} onChange={formik.handleChange} onBlur={formik.handleBlur} />
          <div className="text-danger">
            {formik.errors.id}
          </div>
          Name: <input type="text" id="name" className={`form-control ${(formik.errors.name && formik.touched && formik.dirty)?'is-invalid':''}`} onChange={formik.handleChange} onBlur={formik.handleBlur} />
          <div className="text-danger">
            {formik.errors.name}
          </div>
          Category: <select id="category" className={`form-select ${(formik.errors.category)?'is-invalid':''}`}  onChange={formik.handleChange} onBlur={formik.handleBlur} >
            <option value="">-- Choose a category --</option>
            <option value="electronics">Electronics</option>
            <option value="stationery">Stationery</option>
            <option value="fashion">Fashion</option>
            <option value="home-kitchen">Home & Kitchen</option>
            <option value="books">Books</option>
            <option value="sports-fitness">Sports & Fitness</option>
            <option value="beauty-personal-care">Beauty & Personal Care</option>
            <option value="toys-games">Toys & Games</option>
            <option value="automobile-accessories">Automobile Accessories</option>
            <option value="grocery">Grocery</option>
            <option value="health-wellness">Health & Wellness</option>

          </select>
          <div className="text-danger">
            {formik.errors.category}
          </div>
          Price: <input id="price" type="number" className={`form-control ${(formik.errors.price)?'is-invalid':''}`}  onChange={formik.handleChange} onBlur={formik.handleBlur} />
          <div className="text-danger">
            {formik.errors.price}
          </div>
          <br />
          <input type="button" value="Submit" className={`btn btn-info (formik.isValid)?'': 'disabled'`} onClick={()=>alert('hi')} />
        </form>
  </div>
}