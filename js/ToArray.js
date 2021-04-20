function toArray(obj) 
{
    // First attempt
    // let arr = [];
	// Object.keys(obj)
    // .forEach(function eachKey(key) { 
    //     temp = [];
    //     temp.push(key);
    //     temp.push(obj[key]);
    //     arr.push(temp);
    // });
    // return arr;

    // Much better answer
    return Object.entries(obj);
}

console.log(toArray({ a: 1, b: 2 }));