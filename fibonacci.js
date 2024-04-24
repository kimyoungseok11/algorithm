let d = Array(100).fill(0);

function fibo(x) {
  if (x === 1 || x === 2) {
    return 1;
  }
  return fibo(x - 1) + fibo(x - 2);
}

function fibo2(x) {
  if (x === 1 || x === 2) {
    return 1;
  }
  if (d[x] !== 0) {
    return d[x];
  }
  d[x] = fibo2(x - 1) + fibo2(x - 2);
  return d[x];
}

console.log(fibo2(30));
