function solution(name, yearning, photo) {
  var answer = [];
  var nameObj = {};
  name.forEach((elem, index) => {
    nameObj[elem] = yearning[index];
  });

  //   for (let i = 0; i < photo.length; i++) {
  //     let score = 0;
  //     for (let j = 0; j < photo[i].length; j++) {
  //       if (nameObj[photo[i][j]]) {
  //         score = score + nameObj[photo[i][j]];
  //       }
  //     }
  //     answer.push(score);
  //   }
  return photo.map((elem) =>
    elem
      .map((value) => (nameObj[value] ? nameObj[value] : 0))
      .reduce((acc, cur) => acc + cur)
  );
  //   return answer;
}

console.log(
  solution(
    ["may", "kein", "kain", "radi"],
    [5, 10, 1, 3],
    [
      ["may", "kein", "kain", "radi"],
      ["may", "kein", "brin", "deny"],
      ["kon", "kain", "may", "coni"],
    ]
  )
);
