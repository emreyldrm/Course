import { useState,useEffect } from "react";
import { useParams } from "react-router-dom";
function User() {
    
    const {id} = useParams();
    const [user, setUser] = useState({});

    useEffect(()=>{
        fetch("https://jsonplaceholder.typicode.com/users/" + id)
        .then((res) => res.json())
        .then((data) => setUser(data));
    },[id]);

    return(
        <>
        <div className="row">
            <div className="col-12">
                <h2>User Details</h2>
                <hr />
            </div>
            <div className="col-12">
                <div className="list-group">
                    <div><b>Name : </b><span>{user.name}</span></div>
                    <div><b>Username : </b><span>{user.username}</span></div>
                    <div><b>Email : </b><span><a href={"mailto:" + user.email} target="_blank">{user.email}</a></span></div>
                    <div><b>Website : </b><span>{user.website}</span></div>
                    <div><b>Company Name : </b><span>{user.company?.name}</span></div>
                </div>
            </div>
        </div>
        </>
    );
}

export default User;