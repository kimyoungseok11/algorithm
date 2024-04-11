const fs = require("fs");
const input = fs.readFileSync("./test.txt").toString().trim();

function solution(numbers) {
  let result;
  let numberSplitOne = numbers
    .split("1")
    .filter((number) => number !== "").length;
  let numberSplitZero = numbers
    .split("0")
    .filter((number) => number !== "").length;

  if (numberSplitOne >= numberSplitZero) {
    result = numberSplitZero;
  } else {
    result = numberSplitOne;
  }

  return result;
}

solution(input);
