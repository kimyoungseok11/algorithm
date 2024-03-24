function solution(wallpaper) {
  var xArray = [];
  var yArray = [];
  var tempArray = wallpaper.map((elem) => elem.split(""));
  for (let i = 0; i < tempArray.length; i++) {
    for (let j = 0; j < tempArray[i].length; j++) {
      if (tempArray[i][j] === "#") {
        xArray.push(i);
        yArray.push(j);
      }
    }
  }

  return [
    Math.min(...xArray),
    Math.min(...yArray),
    Math.max(...xArray) + 1,
    Math.max(...yArray) + 1,
  ];
}

console.log(
  solution([
    ".##...##.",
    "#..#.#..#",
    "#...#...#",
    ".#.....#.",
    "..#...#..",
    "...#.#...",
    "....#....",
  ])
);
