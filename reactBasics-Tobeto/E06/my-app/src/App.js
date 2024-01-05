import logo from './logo.svg';
import Header from "./components/Header.js"
import Variables from "./components/Variables.js"
import Props from "./components/Props.js"
import Loop from "./components/Loop.js"
import UserDetail from "./components/UserDetail.js"
import './App.css';

const info = {
  title: "Lorem, ipsum dolor.",
  desc: "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Debitis ipsam aliquam dolor."
};
const users = [
  {
    id:101,
    name: "Layn",
    userName: "Bret",
    company:"X Comp."
  },
  {
    id:102,
    name: "Deck",
    userName: "Seck",
    company:"Y Comp."
  },
  {
    id:103,
    name: "Meck",
    userName: "Zack",
    company:"Z Comp."
  },
]

function App() {
  return (
    
    // <div className="App">
    //   <header className="App-header">
    //     <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload!!
    //     </p>
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
    // </div>
    // <div>
    //   <Header />
    //   <p>Hello World!</p>
    //   <label htmlFor="myinput">
    //     Name
    //     <input id="myinput" />
    //   </label>
    // </div>
    // <div>
    //   <Props name="Murat" surname={"Başeren"} age={30} developer={true} info={info} />
    // </div>
    // <div>
    //   <Loop users={users}/>
    // </div>
    <div>
      <UserDetail name={"Murat Başeren"} age={"30"} hobbies={["book","guitar","coding"]} address={{detail:"adresim", zipcode:80090}} />
    </div>
  );
}

export default App;
