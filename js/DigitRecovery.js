function toCamelCase(str) {
    var arr = str.split("_");
    for (i = 1; i < arr.length; i++)
    {
        arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].slice(1);;
    }
	return arr.join("");
}

function toSnakeCase(str) {
	var arr = str.split('');
    for (var i = 0; i < str.length; i++)
    {
        if (arr[i].toUpperCase() == arr[i])
        {
            arr[i] = "_" + arr[i].toLowerCase();
        }
    }
    return arr.join("");
}

console.log(toSnakeCase("test_hello_world"))
console.log(toCamelCase("testHelloWorld"))