const fs = require('fs');
const input = fs.readFileSync("./test.txt").toString().trim().split("\n");

let cardNum = input[0].split(" ");
let numbers = input[1].split(" ");
let max=0;

for(let i = 0; i < cardNum.length; i++){
    cardNum[i] = Number(cardNum[i]);
}
for(let i = 0; i < numbers.length; i++){
    numbers[i] = Number(numbers[i]);
}

for(let i = 0; i < numbers.length; i++){
    for(let j = i + 1; j < numbers.length; j++){
        for(let k = j + 1; k < numbers.length; k++){
            result = numbers[i] + numbers[j] + numbers[k];
            if(result <= cardNum[1] && max < result){
                max = result
            }
        }
    }
}

console.log(max);