function solution(n) {
  var answer = 0;

  var sum = 0;
  for (let i = 1; i <= n; i++) {
    for (let j = i; j <= n; j++) {
      sum += j;
      if (sum === n) {
        sum = 0;
        answer += 1;
        break;
      }

      if (sum > n) {
        sum = 0;
        break;
      }
    }
  }
  return answer;
}

solution(15);
