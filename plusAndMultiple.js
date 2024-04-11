function solution(numbers) {
  let answer = 0;

  const numberArray = numbers.split("").map((number) => {
    return parseInt(number);
  });

  for (let i = 0; i < numberArray.length; i++) {
    if (numberArray[i] === 0 || numberArray[i] === 1 || answer === 0) {
      answer += numberArray[i];
    } else if (numberArray[i] > 1) {
      answer *= numberArray[i];
    }
  }
}

solution("567");
