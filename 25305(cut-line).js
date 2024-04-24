const fs = require("fs");
const input = fs.readFileSync("./test.txt").toString().trim().split("\n");

const [n, k] = input[0].split(" ").map((number) => parseInt(number));
const score = input[1]
  .split(" ")
  .map((number) => parseInt(number))
  .sort((a, b) => b - a);

console.log(score[k - 1]);
