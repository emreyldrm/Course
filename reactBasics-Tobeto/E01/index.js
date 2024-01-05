//var slugify = require("slugify"); //common.js versiyonu
import slugify from "slugify";
import mymath,{ sum, diff,str,obj,number,arr} from "./my-math.js";

// const str = "hello world";
// //const result = slugify(str);
// const result = slugify(str,"=");
// console.log(result);

mymath(`SUM : ${sum(4,5)}`);
mymath(`DIFF : ${diff(7,4)}`);

console.log(str);
console.log(number);
console.log(obj);
console.log(obj.category);
console.log(obj.order);
console.log(arr);
