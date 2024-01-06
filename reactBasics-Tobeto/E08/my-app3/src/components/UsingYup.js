import { useFormik } from "formik";
import validations from "./Validations"

function UsingFormik2() {
    // const formik = useFormik({
    const {handleSubmit,handleChange,values,errors} = useFormik({
        initialValues: {
            firstName: "",
            lastName: "",
            email: "",
            password: "",
            repassword: ""
        },
        onSubmit: values => {
            console.log(values);
        },
        validationSchema: validations
    });
    return (
        <div>
            <div className="row mb-3">
                <div className="col">
                    <h1>Using YUP</h1>
                    <hr />
                </div>
            </div>

            <div className="row mb-3">
                <div className="col-4 offset-4">
                        <form onSubmit={handleSubmit}>
                            <div className="mb-2">
                                <label htmlFor="firstName" className="form-label">First Name</label>
                                <input type="text" id="firstName" name="firstName" placeholder="John" className="form-control" 
                                value={values.firstName} onChange={handleChange}/>
                                <span className="small text-danger ps-2">{errors.firstName} </span>
                            </div>
                            <div className="mb-2">
                                <label htmlFor="lastName" className="form-label">Last Name</label>
                                <input type="text" id="lastName" name="lastName" placeholder="Doe" className="form-control"
                                value={values.lastName} onChange={handleChange} />
                                <span className="small text-danger ps-2">{errors.lastName} </span>
                            </div>
                            <div className="mb-2">
                                <label htmlFor="email" className="form-label">E-mail</label>
                                <input id="email" name="email" type="email" placeholder="john@doe.com" className="form-control"
                                value={values.email} onChange={handleChange} />
                                <span className="small text-danger ps-2">{errors.email} </span>
                            </div>
                            <div className="mb-2">
                                <label htmlFor="password" className="form-label">Password</label>
                                <input id="password" name="password" type="password" placeholder="*******" className="form-control"
                                value={values.password} onChange={handleChange} />
                                <span className="small text-danger ps-2">{errors.password} </span>
                            </div>
                            <div className="mb-2">
                                <label htmlFor="repassword" className="form-label">Re-Password</label>
                                <input id="repassword" name="repassword" type="password" placeholder="*******" className="form-control"
                                value={values.repassword} onChange={handleChange} />
                                <span className="small text-danger ps-2">{errors.repassword} </span>
                            </div>
                            <div className="mb-2 pt-2 text-center">
                                <button className="btn btn-primary" type="submit">Send Form</button>
                            </div>
                        </form>
                </div>
            </div>

        </div>
    );
}

export default UsingFormik2;