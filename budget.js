function solution(d, budget) {
  const sum = d.reduce((accumulator, currentValue) => {
    return accumulator + currentValue;
  }, 0);

  if (sum === budget || sum < budget) {
    return d.length;
  }

  let paySum = 0;
  let count = 0;

  d = d.sort((a, b) => a - b);

  while (paySum < budget) {
    if (paySum + d[count] > budget) {
      break;
    }
    paySum += d[count];
    count += 1;
  }

  return count;
}

solution([1, 3, 2, 5, 4], 9);
