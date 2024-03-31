const graph = {
  A: ["B", "C"],
  B: ["A", "D"],
  C: ["A", "G", "H", "I"],
  D: ["B", "E", "F"],
  E: ["D"],
  F: ["D"],
  G: ["C"],
  H: ["C"],
  I: ["C", "J"],
  J: ["I"],
};

function dfs(startNode) {
  let visited = [];
  let needVisited = [];

  needVisited.push(startNode);

  while (needVisited.length !== 0) {
    const nodes = needVisited.pop();
    if (!visited.includes(nodes)) {
      visited.push(nodes);
      needVisited = [...needVisited, ...graph[nodes].reverse()];
    }
  }

  console.log(visited);
}

dfs("A");
