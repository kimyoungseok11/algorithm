const fs = require("fs");
const input = fs
  .readFileSync("./test.txt")
  .toString()
  .trim()
  .split("\n")
  .map((number) => parseInt(number));

const sorted = input.sort((a, b) => a - b);
let sum = 0;

for (let i = 0; i < sorted.length; i++) {
  sum += sorted[i];
}

console.log(sum / sorted.length);
console.log(sorted[2]);
