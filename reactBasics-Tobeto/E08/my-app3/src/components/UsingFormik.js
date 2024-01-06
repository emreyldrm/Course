import { Formik, Field, Form } from "formik";

function UsingFormik() {
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
                    <Formik initialValues={{
                        firstName: "",
                        lastName: "",
                        email: ""
                    }} 
                    onSubmit={(values) => console.log(values)}>
                        <Form>
                            <div className="mb-2">
                                <label htmlFor="firstName" className="form-label">First Name</label>
                                <Field id="firstName" name="firstName" placeholder="John" className="form-control" />
                            </div>
                            <div className="mb-2">
                                <label htmlFor="lastName" className="form-label">Last Name</label>
                                <Field id="lastName" name="lastName" placeholder="Doe" className="form-control" />
                            </div>
                            <div className="mb-2">
                                <label htmlFor="email" className="form-label">E-mail</label>
                                <Field id="email" name="email" type="email" placeholder="john@doe.com" className="form-control" />
                            </div>
                            <div className="mb-2 pt-2 text-center">
                                <button className="btn btn-primary" type="submit">Send Form</button>
                            </div>
                        </Form>
                    </Formik>
                </div>
            </div>

        </div>
    );
}

export default UsingFormik;