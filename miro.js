const dir = [
  [-1, 0],
  [1, 0],
  [0, -1],
  [0, 1],
];

function solution(x, y, graph) {
  let queue = [];
  let n = graph.length;
  let m = graph[0].length;

  queue.push([x, y]);

  while (queue.length !== 0) {
    const [x, y] = queue.shift();
    console.log(x, y);
    for (let i = 0; i < dir.length; i++) {
      let nx = x + dir[i][0];
      let ny = y + dir[i][1];

      if (nx < 0 || ny < 0 || nx >= 5 || ny >= 6) {
        continue;
      }
      if (graph[nx][ny] === 0) {
        continue;
      }
      if (graph[nx][ny] === 1) {
        graph[nx][ny] = graph[x][y] + 1;
        queue.push([nx, ny]);
      }
    }
  }

  console.log(graph[n - 1][m - 1]);
  return graph[n - 1][m - 1];
}

solution(0, 0, [
  [1, 0, 1, 0, 1, 0],
  [1, 1, 1, 1, 1, 1],
  [0, 0, 0, 0, 0, 1],
  [1, 1, 1, 1, 1, 1],
  [1, 1, 1, 1, 1, 1],
]);
