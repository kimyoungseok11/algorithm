function solution(name, yearning, photo) {
  var answer = [];
  var missScore = {};

  for (let i = 0; i < name.length; i++) {
    missScore[name[i]] = yearning[i];
  }

  for (let i = 0; i < photo.length; i++) {
    let score = 0;

    for (let j = 0; j < photo[i].length; j++) {
      if (Object.keys(missScore).includes(photo[i][j])) {
        score += missScore[photo[i][j]];
      }
    }
    answer.push(score);
  }

  return answer;
}

solution(
  ["may", "kein", "kain", "radi"],
  [5, 10, 1, 3],
  [
    ["may", "kein", "kain", "radi"],
    ["may", "kein", "brin", "deny"],
    ["kon", "kain", "may", "coni"],
  ]
);
