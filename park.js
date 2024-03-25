function solution(park, routes) {
  let startX;
  let startY;
  let parkXLength = park.length;
  let parkYLength = park[0].length;
  let answer = [];
  const dirRoute = {
    E: [0, 1],
    W: [0, -1],
    S: [1, 0],
    N: [-1, 0],
  };
  let parkArray = park.map((elem) => {
    const route = elem.split("");
    return route;
  });

  let dirArray = routes.map((route) => {
    const [dir, goCount] = route.split(" ");
    return [dir, goCount];
  });

  for (let i = 0; i < parkArray.length; i++) {
    for (let j = 0; j < parkArray[i].length; j++) {
      if (parkArray[i][j] === "S") {
        startX = i;
        startY = j;
      }
    }
  }

  dirArray.forEach((direction) => {
    const dir = direction[0];
    const moveCount = Number(direction[1]);
    let [mx, my] = dirRoute[dir];
    let finX = startX;
    let finY = startY;
    let count = 0;
    for (let i = 1; i <= moveCount; i++) {
      finX = mx + finX;
      finY = my + finY;
      if (finX >= parkYLength || finY >= parkXLength) {
        break;
      }
      if (parkArray[finX][finY] === "O") {
        count += 1;
      }
    }

    if (moveCount === count) {
      startX = finX;
      startY = finY;
    }
  });
  answer.push(startX);
  answer.push(startY);
  console.log(answer);
  return answer;
}

solution(["SOO", "OOO", "OOO"], ["E 2", "S 2", "W 1"]);
solution(["SOO", "OXX", "OOO"], ["E 2", "S 2", "W 1"]);
solution(["OSO", "OOO", "OXO", "OOO"], ["E 2", "S 3", "W 1"]);
