let numbers = [1,2,2,3,4,3,5,6,5,10,6,7,8,8,1,9];
let newList = [];
for (let number of numbers){
	if (!newList.includes(number)){
		newList.push(number);
	}
}
console.log(newList);