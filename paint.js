function solution(n, m, section) {
  let arr = [];
  let answer = 0;
  for (let i = 0; i < n; i++) {
    arr.push(1);
  }

  section.forEach((elem, index) => {
    arr[elem - 1] = 0;
  });

  arr.forEach((elem, index) => {
    if (arr[index] === 0) {
      //   console.log(index);
      for (let i = index; i < index + m; i++) {
        arr[i] = 1;
      }
      answer++;
    }
  });

  return answer;
}

console.log(solution(8, 4, [2, 3, 6]));
