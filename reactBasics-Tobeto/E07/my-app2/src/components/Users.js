import { useState,useEffect } from "react";
import { Link, Outlet } from "react-router-dom";
function Users() {
    const [users, setUsers] = useState([]);

    useEffect(()=>{
        fetch("https://jsonplaceholder.typicode.com/users")
        .then((res) => res.json())
        .then((data) => setUsers(data));
    },[]);

    return(
        <>
        <div className="row">
            <div className="col-12">
                <h2>Users</h2>
                <hr />
            </div>
            <div className="col-6">
                <div className="list-group">
                    {
                        users.map((user) => {
                            return (
                            <li className="list-group-item" key={user.id}>
                                <Link to={`/users/${user.id}`}>{user.name} ({user.username}) </Link>
                            </li>
                            )
                        })
                    }
                </div>
            </div>
            <div className="col-6">
                <Outlet />
            </div>
        </div>
        </>
    );
}

export default Users;