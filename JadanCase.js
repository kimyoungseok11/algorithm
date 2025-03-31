function solution(s) {
  var answer = "";
  var pattern2 = /[a-zA-Z]/;
  var arr = s.split(" ");

  for (let i = 0; i < arr.length; i++) {
    let changeString = "";
    if (pattern2.test(arr[i][0])) {
      changeString += arr[i][0].toUpperCase();
    } else {
      changeString += arr[i][0];
    }

    changeString += arr[i].substr(1, arr[i].length - 1).toLowerCase();

    if (i === arr.length - 1) {
      answer += changeString;
    } else {
      answer += changeString + " ";
    }
  }
  console.log(answer);

  return answer;
}

solution("3people un3Followed me");
