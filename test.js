const fs = require('fs');
let input = fs.readFileSync('./test.txt').toString().split('\n');

let count = input[0]
let numbers = [];
let min;
let max;

numbers = input[1].split(' ');
for(let i = 0; i < numbers.length; i++){
    numbers[i] = Number(numbers[i]);
}

min = numbers[0];
max = numbers[0];

for(let i = 0; i < numbers.length; i++){
    if(min > numbers[i]){
        min = numbers[i];
    }
}

for(let i = 0; i < numbers.length; i++){
    if(max < numbers[i]){
        max = numbers[i]
    }
}

console.log(min+" "+max);