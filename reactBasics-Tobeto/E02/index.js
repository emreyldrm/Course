// setTimeout(()=>{
//     console.log("setTimeout");
// },3000)

// setInterval(()=>{
//     console.log("setInterval");
// },1000)

function runCallbackFunc(callback){
    callback();
}

// 3 farklı yazım şekli.
runCallbackFunc(function() {console.log("Hello world!");})
runCallbackFunc(() => {console.log("Hello world!");})
runCallbackFunc(() => console.log("Hello world!"));
