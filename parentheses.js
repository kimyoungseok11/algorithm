function solution(s) {
  let array = s.split("");
  let resultArr = [];

  resultArr.push(array[0]);

  var deletedIndex = 0;
  array = array.filter(function (_, index) {
    return index !== deletedIndex;
  });

  for (let i = 0; i < array.length; i++) {
    resultArr.push(array[i]);

    if (
      resultArr[resultArr.length - 2] === "(" &&
      resultArr[resultArr.length - 1] === ")"
    ) {
      resultArr.pop();
      resultArr.pop();
    }
  }

  if (resultArr.length === 0) {
    return true;
  } else {
    return false;
  }
}

solution("(())()");
