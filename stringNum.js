function solution(t, p) {
  var answer = 0;
  var numArray = [];

  for (let i = 0; i < t.length; i++) {
    let lastIdx = p.length;
    let subString = t.substr(i, lastIdx);
    if (subString.length === p.length) {
      numArray.push(Number(subString));
    }
  }

  console.log(numArray);

  numArray.map((elem) => {
    if (elem <= Number(p)) {
      answer += 1;
    }
  });

  console.log(answer);

  return answer;
}

solution("10203", "15");
