import Product from "../Product";
export default function Category({val,setVal}){
    return(
        <div>
            <h1>Category Component</h1>
            <hr />
            <div>
                val : {val}
            </div>
            <div>
                <Product val={val} setVal={setVal} />
            </div>
        </div>
    );
}

