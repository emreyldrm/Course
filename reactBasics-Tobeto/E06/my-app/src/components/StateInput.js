import {useState} from 'react'
function StateInput() {

    const [name,setName] = useState("Murat");
    const [surname,setSurname] = useState("Başeren");
    const [age,setAge] = useState(30);

    const onChangeName = (event) => setName(event.target.value);
    const onChangeSurname = (e) => setSurname(e.target.value);
    const onChangeAge = (event) => setAge(event.target.value);

    return(
        <div>
            <h1>State Input</h1>
            <hr />
            <div>
                {name} {surname} ({age})
            </div>
            <br />
            <div>
                <input type='text' placeholder='name' value={name} onChange={onChangeName}/>
                <input type='text' placeholder='surname' value={surname} onChange={onChangeSurname}/>
                <input type='number' placeholder='age' value={age} onChange={onChangeAge}/>
            </div>
            <br />

        </div>
    );
}

export default StateInput;