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

//스택 dfs
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
  return visited;
}

//재귀 dfs
function solution() {
  let visited = [];

  function dfs(startNode) {
    if (!visited.includes(startNode)) {
      visited.push(startNode);
    }
    const node = graph[startNode];
    for (let i = 0; i < node.length; i++) {
      if (!visited.includes(node[i])) {
        dfs(node[i]);
      }
    }
  }

  dfs("A");
  console.log(visited);
  return visited;
}

// graph 자료구조와 startNode를 입력
const bfs = (startNode) => {
  let visited = []; // 탐색을 마친 노드들
  let needVisit = []; // 탐색해야할 노드들

  needVisit.push(startNode);

  while (needVisit.length !== 0) {
    const nodes = needVisit.shift();
    if (!visited.includes(nodes)) {
      visited.push(nodes);
      needVisit = [...needVisit, ...graph[nodes]];
    }
  }
  // console.log(visited);
  return visited;
};

solution("A");
bfs("A");
