import { useState, useEffect } from "react";
import axios from "axios";
function UsingAxios() {

    const [users, setUsers] = useState([]);
    const [isloading, setIsLoading] = useState(true);

    useEffect(() => {
        axios("https://jsonplaceholder.typicode.com/users")
        .then((res) => setUsers(res.data))
        .catch((e) => console.log(e))
        .finally(() => setIsLoading(false));
    });

    return(
        <div>
            <div className ="row mt-5">
                <div className="col">
                    <h1>Using Axios</h1>
                    <hr />
                </div>
            </div>
            {
                isloading && 
                <div className="row">
                <div className="col">
                    <div className="alert alert-info">
                        <i className="fa fa-sync fa-spin me-2"></i> yükleniyor..
                    </div>
                </div>
            </div>
            }

            <div className="row mt-3">
                <ul className="list-group">
                    {
                        users.map((user) => 
                        <li key={user.id} className="list-group-item">{user.name} ({user.username}) </li>)
                    }
                </ul>
            </div>

        </div>
    );
}

export default UsingAxios;