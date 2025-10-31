const prompt = require("prompt-sync")({signint:true});

function addition(num1, num2){
	let result = num1 + num2
	return result
}

let word = prompt("Enter a number: ");

console.log(word.toUpperCase)
