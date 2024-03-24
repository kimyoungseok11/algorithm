function oneMaker(number) {
  let [n, k] = number.split(" ").map(Number);
  let result = 0;

  while (n !== 1) {
    if (n % k === 0) {
      n = n / k;
      result += 1;
    } else {
      n -= 1;
      result += 1;
    }
  }
  console.log(result);
  return result;
}

oneMaker("37 3");
