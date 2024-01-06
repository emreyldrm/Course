import './App.css';
import {useState} from "react";
import Category from './components/Category';
import Tag from './components/Tag';
import Counter from './features/Counter';
function App() {
  const [value, setValue] = useState(0);
  return (
    <div className="App">
      {/* <Category val={value} setVal={setValue} />
      <Tag val={value}/> */}
      <Counter />
    </div>
  );
}

export default App;
