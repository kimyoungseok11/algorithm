function solution(k, m, score) {
  var answer = 0;

  score = score.sort((a, b) => {
    return b - a;
  });

  while (score.length >= m) {
    const box = score.splice(0, m);
    const lowest = Math.min(...box);

    answer += lowest * m;
  }
  return answer;
}

solution(4, 3, [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]);
