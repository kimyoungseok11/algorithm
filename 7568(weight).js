const { count } = require('console');
const fs = require('fs');
const input = fs.readFileSync("./test.txt").toString().trim().split("\n");

let numbers = input[0];
let weightHeight = input.slice(1,input.length);
let ranking = []

for(let i = 0; i < weightHeight.length; i++){
    weightHeight[i] = weightHeight[i].split(" ");
    for(let j = 0; j < weightHeight[i].length; j++){
        weightHeight[i][j] = Number(weightHeight[i][j]);
    }
}

for(let i = 0; i < weightHeight.length; i++){
    let count = 1;
    for(let j = 0; j < weightHeight.length; j++){
        let weightWin = weightHeight[i][0];
        let heightWin = weightHeight[i][1];

        if(weightHeight[j][0] > weightWin && weightHeight[j][1] > heightWin){
            count += 1;
        }
    }
    ranking.push(count);
}

for(let i = 0; i < ranking.length; i++){
    console.log(ranking[i]);
}