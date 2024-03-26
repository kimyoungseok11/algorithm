function solution(numbers) {
  let result = [];
  for (let i = 0; i < numbers.length; i++) {
    for (let j = i + 1; j < numbers.length; j++) {
      let sum = numbers[i] + numbers[j];
      if (!result.includes(sum)) {
        result.push(sum);
      }
    }
  }

  result.sort((a, b) => a - b);
  return result;
}

solution([5, 0, 2, 7]);
