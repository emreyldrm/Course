import { useFormik } from "formik";

function UsingFormik2() {
    // const formik = useFormik({
    const {handleSubmit,handleChange,values} = useFormik({
        initialValues: {
            firstName: "murat",
            lastName: "başeren",
            email: "muratbaseren@gmail.com"
        },
        onSubmit: values => {
            console.log(values);
        }
    });
    return (
        <div>
            <div className="row mb-3">
                <div className="col">
                    <h1>Using Formik</h1>
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
                            </div>
                            <div className="mb-2">
                                <label htmlFor="lastName" className="form-label">Last Name</label>
                                <input type="text" id="lastName" name="lastName" placeholder="Doe" className="form-control"
                                value={values.lastName} onChange={handleChange} />
                            </div>
                            <div className="mb-2">
                                <label htmlFor="email" className="form-label">E-mail</label>
                                <input id="email" name="email" type="email" placeholder="john@doe.com" className="form-control"
                                value={values.email} onChange={handleChange} />
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