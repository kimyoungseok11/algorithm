function solution(n, arr1, arr2) {
  var answer = [];

  let arr1binary = arr1.map((data) => {
    return data.toString(2).padStart(n, "0");
  });

  let arr2binary = arr2.map((data) => {
    return data.toString(2).padStart(n, "0");
  });

  for (let i = 0; i < n; i++) {
    let letter = "";
    for (let j = 0; j < n; j++) {
      if (arr1binary[i][j] === "0" && arr2binary[i][j] === "0") {
        letter += " ";
      } else {
        letter += "#";
      }
    }
    answer.push(letter);
  }

  return answer;
}

solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]);
console.log(solution(6, [46, 33, 33, 22, 31, 50], [27, 56, 19, 14, 14, 10]));
