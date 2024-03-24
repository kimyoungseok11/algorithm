function biggestNumber(params, numberParam) {
  let [arrayLength, plusCount, plusLimit] = params.split(" ").map(Number);
  let savePlusLimit = plusLimit;
  let sum = 0;
  const numbers = numberParam.split(" ").map(Number).sort();

  while (plusCount > 0) {
    if (plusLimit > 0) {
      sum += numbers[arrayLength - 1];
      plusCount -= 1;
      plusLimit -= 1;
      console.log(numbers[arrayLength - 1], plusCount, plusLimit, arrayLength);
    } else {
      sum += numbers[arrayLength - 2];
      plusLimit = savePlusLimit;
      plusCount -= 1;
    }
  }

  console.log(sum);
}

biggestNumber("5 7 2", "3 4 3 4 3");
