const fs = require("fs");
const input = fs.readFileSync("./test.txt").toString().trim();

function solution(numbers) {
  const numberArray = numbers.split(" ").map((number) => parseInt(number));
  const [a, b, c, d, e, f] = numberArray;
  let answerX;
  let answerY;
  for (let x = -999; x <= 999; x++) {
    for (let y = -999; y <= 999; y++) {
      let ax = a * x;
      let by = b * y;
      let dx = d * x;
      let ey = e * y;

      if (ax + by === c && dx + ey === f) {
        answerX = x;
        answerY = y;
        break;
      }
    }
  }
  console.log(`${answerX} ${answerY}`);
  return `${answerX} ${answerY}`;
}

console.log(solution(input));
