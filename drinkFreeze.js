function solution(square) {
  let result = 0;
  const dirs = [
    [-1, 0],
    [1, 0],
    [0, -1],
    [0, 1],
  ];

  function dfs(x, y, xLength, yLength) {
    if (x < 0 || y < 0 || x >= xLength || y > yLength) {
      return false;
    }
    if (square[x][y] === 0) {
      square[x][y] = 1;
      dirs.forEach((dir) => {
        dfs(x + dir[0], y + dir[1]);
      });
      return true;
    }
  }

  for (let i = 0; i < square.length; i++) {
    for (let j = 0; j < square[i].length; j++) {
      if (square[i][j] === 0) {
        dfs(i, j, square.length, square[i].length);
        result += 1;
      }
    }
  }
  console.log(result);
}

solution([
  [1, 0, 1, 0, 1, 0],
  [1, 1, 1, 1, 1, 1],
  [0, 0, 0, 0, 0, 1],
  [1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1],
]);
