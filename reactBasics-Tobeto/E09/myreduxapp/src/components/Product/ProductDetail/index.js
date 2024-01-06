
export default function ProductDetail({val,setVal}){
    return(
        <div>
            <h1>Product Detail Component</h1>
            <hr />
            <div>
                val : {val}
            </div>
            <div>
                <button onClick={()=>setVal(20)}>Set Val to 20</button>
            </div>
        </div>
    );
}