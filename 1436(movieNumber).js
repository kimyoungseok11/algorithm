const fs = require("fs");
const input = fs.readFileSync("./test.txt").toString().trim();
///dev/stdin

function solution(number) {
  let count = 0;
  let ruinNumber = 0;

  while (count !== number) {
    ruinNumber += 1;
    if (ruinNumber.toString().includes("666")) {
      count += 1;
    }
  }
  console.log(ruinNumber);
  return ruinNumber;
}

solution(parseInt(input));
