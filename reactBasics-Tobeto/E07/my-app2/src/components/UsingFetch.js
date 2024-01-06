import { useState, useEffect } from "react";
function UsingFetch() {

    const [users, setUsers] = useState([]);
    const [isloading, setIsLoading] = useState(true);

    useEffect(() => {
        fetch("https://jsonplaceholder.typicode.com/users")
        .then((res) => res.json())
        .then((data) => setUsers(data))
        .catch((e) => console.log(e))
        .finally(() => setIsLoading(false));
    });

    return(
        <div>
            <div className ="row mt-5">
                <div className="col">
                    <h1>Using Fetch</h1>
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

export default UsingFetch;