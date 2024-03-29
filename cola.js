function solution(a, b, n) {
  let result = 0;
  let cola;

  while (n % a !== n) {
    cola = parseInt(n / a) * b;
    n = parseInt(n % a) + cola;
    result += cola;
  }
  console.log(result);
  return result;
}

solution(2, 1, 20);
