function solution(keymap, targets) {
  const keyObj = {};
  const answer = [];
  for (let i = 0; i < keymap.length; i++) {
    for (let j = 0; j < keymap[i].length; j++) {
      if (
        !keyObj[keymap[i][j]] ||
        keyObj[keymap[i][j]] > keymap[i].indexOf(keymap[i][j]) + 1
      ) {
        keyObj[keymap[i][j]] = keymap[i].indexOf(keymap[i][j]) + 1;
      }
    }
  }

  for (let i = 0; i < targets.length; i++) {
    let tmpArr = [];
    for (let j = 0; j < targets[i].length; j++) {
      if (keyObj[targets[i][j]]) {
        tmpArr.push(keyObj[targets[i][j]]);
      } else {
        tmpArr.push(-1);
      }
    }

    if (tmpArr.includes(-1)) {
      answer.push(-1);
    } else {
      let sum = 0;
      for (let i = 0; i < tmpArr.length; i++) {
        sum += tmpArr[i];
      }
      answer.push(sum);
    }
  }

  return answer;
}

solution(["ABACD", "BCEFD"], ["ABCD", "AABR"]);
