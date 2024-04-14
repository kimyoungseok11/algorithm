const fs = require("fs");
const input = fs.readFileSync("./test.txt").toString().trim();
///dev/stdin

function solution(number) {
  let sugarArray = [];
  for (let x = 0; x < number; x++) {
    for (let y = 0; y < number; y++) {
      if (5 * x + 3 * y === number) {
        sugarArray.push(x + y);
      }
    }
  }
  if (sugarArray.length === 0) {
    console.log(-1);
  } else {
    console.log(Math.min(...sugarArray));
  }
}

solution(parseInt(input));
