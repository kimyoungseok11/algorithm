function solution(n, network) {
  let answer = 0;

  const dirs = [
    [-1, 0],
    [1, 0],
    [0, -1],
    [0, 1],
  ];

  function dfs(n, x, y) {
    if (x >= n || y >= n || x < 0 || y < 0) {
      return false;
    }
    if (network[x][y] === 1) {
      network[x][y] = 0;
      dirs.forEach((dir) => {
        dfs(n, x + dir[0], y + dir[1]);
      });
    }
  }

  for (let i = 0; i < network.length; i++) {
    for (let j = 0; j < network[i].length; j++) {
      if (network[i][j] === 1) {
        dfs(n, i, j);
        answer += 1;
      }
    }
  }

  console.log(answer);
}

solution(3, [
  [1, 1, 0],
  [1, 1, 0],
  [0, 0, 1],
]);
solution(3, [
  [1, 1, 0],
  [1, 1, 1],
  [0, 1, 1],
]);

[
  [60, 50],
  [30, 70],
  [60, 30],
  [80, 40],
];
