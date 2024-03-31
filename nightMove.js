function nightMove(point) {
  let [xPoint, y] = point.split("");
  let x = xPoint.charCodeAt() - 96;
  y = Number(y);
  let count = 0;
  const movePoints = [
    [2, 1],
    [2, -1],
    [-2, 1],
    [-2, -1],
    [1, 2],
    [1, -2],
    [-1, 2],
    [-1, -2],
  ];
  movePoints.forEach((movePoint) => {
    const [mx, my] = movePoint;
    if (mx <= 8 && my <= 8 && mx > 0 && my > 0) {
      count += 1;
    }
  });

  return count;
}

console.log(nightMove("a1"));
