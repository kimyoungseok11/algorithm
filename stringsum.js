function solution(n) {
  var answer = 0;
  var nToString = n.toString();

  for (let i = 0; i < nToString.length; i++) {
    answer += Number(nToString[i]);
  }

  return answer;
}

solution(123);
