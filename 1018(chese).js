const fs = require("fs");
const input = fs.readFileSync("./test.txt").toString().trim().split("\n");

const [x, y] = input[0].split(" ").map((number) => parseInt(number));
const cheseArray = input.filter((line, index) => {
  if (index !== 0) {
    return line.split("");
  }
});
const answer = [];

const whiteBoard = [
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
];

const blackBoard = [
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
  "BWBWBWBW",
  "WBWBWBWB",
];

function blackCheck(i, j) {
  let count = 0;
  for (let x = 0; x < 8; x++) {
    for (let y = 0; y < 8; y++) {
      if (cheseArray[x + i][y + j] !== blackBoard[x][y]) {
        count++;
      }
    }
  }
  return count;
}

function whiteCheck(i, j) {
  let count = 0;
  for (let x = 0; x < 8; x++) {
    for (let y = 0; y < 8; y++) {
      if (cheseArray[x + i][y + j] !== whiteBoard[x][y]) {
        count++;
      }
    }
  }
  return count;
}

for (let i = 0; i < x - 7; i++) {
  for (let j = 0; j < y - 7; j++) {
    answer.push(blackCheck(i, j));
    answer.push(whiteCheck(i, j));
  }
}

console.log(Math.min(...answer));
