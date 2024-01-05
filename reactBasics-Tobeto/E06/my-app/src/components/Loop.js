function Loop({users}) {
    return(
        <ul>
            {
                // users.map((user,i) => <li key={i}>{user.name} ({user.userName}) - Company : {user.company}</li>)
                users.map((user) => <li key={user.id}>{user.name} ({user.userName}) - Company : {user.company}</li>)
            }
        </ul>
    );
}
export default Loop;