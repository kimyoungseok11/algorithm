function solution(N, stages) {
  var answer = [];
  var stageFailure = {};
  for (let i = 1; i <= N; i++) {
    let stageCnt = stages.filter((element) => i <= element).length;
    let failureCnt = stages.filter((element) => i === element).length;

    stageFailure[i] = failureCnt / stageCnt;
  }

  const keysArr = Object.keys(stageFailure);
  answer = keysArr
    .sort((a, b) => stageFailure[b] - stageFailure[a])
    .map((elem) => {
      return Number(elem);
    });

  console.log(answer);

  return answer;
}

solution(5, [2, 1, 2, 6, 2, 4, 3, 3]);
