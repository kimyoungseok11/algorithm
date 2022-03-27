const fs = require('fs');
const input = fs.readFileSync("./test.txt").toString().trim();

let answer = Number(input);
let min = 0;

for(let i = 0; i < answer + 1; i++){
    let temp = String(i);
    let sum = 0;
    for(let j = 0; j < temp.length; j++){
        sum += Number(temp[j]);
    }
    sum += Number(temp);
    if(sum == answer){
        min = Number(temp);
        break;
    }
}

console.log(min);