import {useDispatch, useSelector} from "react-redux";
import { increment, decrement, selectTick, incrementByAmount, incrementByAmountAsync } from "../tickSlice"
import {useState} from "react";

export default function Counter(){
    const [amount, setAmount] = useState(0);

    const value = useSelector(selectTick);
    const dispatch =  useDispatch();
    return(
        <>
        <br />
        <button onClick={() => dispatch(decrement())}>Decrement</button>
        <span className="text">{value}</span>
        <button onClick={() => dispatch(increment())}>Increment</button>
        <br /><br />
        <input onChange={((e) => setAmount(e.target.value))} value={amount} />
        <button onClick={() => dispatch(incrementByAmount({val:parseInt(amount)}))}>Increment by amount</button>
        <button onClick={() => dispatch(incrementByAmountAsync({val:parseInt(amount)}))}>Increment by amount async</button>
        </>
    );
}