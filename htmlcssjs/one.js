const fn1=(marks)=>
{
    const promise=new Promise((resolve,reject)=>
    {
        setTimeout(()=>
        {
            if(marks>=80)
                resolve("Excellent");
            else
                reject("Keep improving");  
        },1000);
    });
    return promise;
}

let p=fn1(85);

p.then(res=>console.log('Then block executed:',res))
    .catch(err=>console.log('Catch block executed:',err))
    .finally(()=>console.log("Execution completed"));   

