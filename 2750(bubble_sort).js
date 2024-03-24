const fs = require("fs");
const splitInput = fs.readFileSync("./test.txt").toString().trim().split("\n");

for (let i = 0; i < splitInput.length; i++) {
  splitInput[i] = Number(splitInput[i]);
}

const numbers = splitInput.filter((element, index) => {
  return splitInput.indexOf(element) === index;
});

for (let i = 0; i < numbers.length; i++) {
  for (let j = i + 1; j < numbers.length; j++) {
    if (numbers[i] > numbers[j]) {
      let tmp = numbers[j];
      numbers[j] = numbers[i];
      numbers[i] = tmp;
    }
  }
}

for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i]);
}
