function LRUD(arraySize, directions) {
  const direction = directions.split(" ");
  let x = 1;
  let y = 1;
  direction.forEach((dir) => {
    switch (dir) {
      case "L":
        if (y - 1 > 1) {
          y -= 1;
        }
        break;
      case "R":
        if (y + 1 < arraySize) {
          y += 1;
        }
        break;
      case "U":
        if (x - 1 > 1) {
          x -= 1;
        }
        break;
      case "D":
        if (x + 1 < arraySize) {
          x += 1;
        }
        break;
      default:
        break;
    }
  });

  return `${x} ${y}`;
}

console.log(LRUD(5, "R R R U D D"));
