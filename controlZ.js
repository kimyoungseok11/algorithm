function solution(s) {
  var numberArr = [];
  s = s.split(" ");

  s.forEach((number) => {
    if (number === "Z") numberArr.pop();
    else {
      numberArr.push(parseInt(number));
    }
  });
  console.log(numberArr);

  if (numberArr.length === 0) {
    return 0;
  }

  const sum = numberArr.reduce((accumulator, currentValue) => {
    return accumulator + currentValue;
  }, 0);

  return sum;
}

solution("10 20 30 40");
solution("1 2 Z 3");
solution("10 20 30 40");
solution("10 Z 20 Z 1");
solution("10 Z 20 Z");
solution("-1 -2 -3 Z");
