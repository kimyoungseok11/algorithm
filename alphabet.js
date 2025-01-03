function solution(s) {
  var answer = "";
  var stringArr = s.split(" ");
  var arr = [];

  stringArr.map((elem) => {
    let tmpString = "";
    for (let i = 0; i < elem.length; i++) {
      if (i % 2 === 0) {
        tmpString += elem[i].toUpperCase();
      } else {
        tmpString += elem[i].toLowerCase();
      }
    }
    arr.push(tmpString);
  });

  for (let i = 0; i < arr.length; i++) {
    if (i === arr.length - 1) {
      answer += arr[i];
    } else {
      answer += arr[i] + " ";
    }
  }
  console.log(answer);
  return answer;
}

solution("try hello world");
