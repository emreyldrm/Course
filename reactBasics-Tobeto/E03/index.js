function first(){
    return "first";
}
function second(){
    return "second";
}
function third(){
    return "third";
}

async function f(){

    let p1 = new Promise(function(resolve,reject){//resolve normal çalışma şartında kullanılıyor.
        const result = first();
        resolve(result);
    });
    
    let p2 = new Promise(function(resolve,reject){ //reject hata durumunda bunu çalıştır diye kullanılıyor
        setTimeout(()=>{
        const result = second();
        resolve(result);
        },2000);
    });
    
    let p3 = new Promise(function(resolve,reject){
        const result = third();
        resolve(result);
    });

    console.log(await p1);
    console.log(await p2);
    console.log(await p3);

}

f();