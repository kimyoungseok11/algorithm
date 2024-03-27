function solution(sides) {
  let answer = 0;
  let a = 0;
  let b = 0;
  let sidesMax = Math.max(...sides);
  let sidesMin = Math.min(...sides);
  let anotherSide = 0;
  while (true) {
    anotherSide += 1;
    let plusNum = sidesMin + anotherSide;
    if (sidesMax < plusNum) {
      a += 1;
      //   console.log(anotherSide);
    }
    if (anotherSide > sidesMax) {
      a -= 1;
      anotherSide = 0;
      break;
    }
  }

  for (let i = sidesMax + 1; i < sidesMax + sidesMin; i++) {
    b += 1;
  }
  answer = a + b;
  return answer;
}
