function gameDevelop(mapSize, startPoint, mapStatus) {
  const [x, y] = mapSize.split(" ").map(Number);
  let [xStart, yStart, dir] = startPoint.split(" ").map(Number);
  let count = 0;
  let breakCount = 0;
  const moves = [
    [-1, 0],
    [0, 1],
    [1, 0],
    [0, -1],
  ];

  while (true) {
    mapStatus[xStart][yStart] = 2;
    count += 1;

    for (let i = 0; i < moves.length; i++) {
      let finXpoint = xStart + moves[dir][0];
      let finYpoint = yStart + moves[dir][1];

      if (finXpoint > x && finYpoint > y && finXpoint < 0 && finYpoint < 0) {
        breakCount += 1;
        if (dir === 3) {
          dir = 0;
        } else {
          dir += 1;
        }
        continue;
      }
      if (mapStatus[finXpoint][finYpoint] === 1) {
        breakCount += 1;
        console.log(breakCount, "dd");
        finXpoint = xStart;
        finYpoint = yStart;
        if (dir === 3) {
          dir = 0;
        } else {
          dir += 1;
        }
        continue;
      } else if (mapStatus[finXpoint][finYpoint] === 0) {
        breakCount = 0;
        mapStatus[finXpoint][finYpoint] = 2;
        xStart = xStart + moves[dir][0];
        yStart = yStart + moves[dir][1];
        count += 1;
      }
    }
    console.log(breakCount);
    break;
  }
  return count;
}

console.log(
  gameDevelop("4 4", "1 1 0", [
    [1, 1, 1, 1],
    [1, 0, 0, 1],
    [1, 1, 0, 1],
    [1, 1, 0, 1],
  ])
);
