function solution(n) {
  var answer = 0;
  var nToBinary = n.toString(2);
  var oneCount = 0;

  for (let i = 0; i < nToBinary.length; i++) {
    if (nToBinary[i] === "1") {
      oneCount += 1;
    }
  }

  while (true) {
    var tmpCount = 0;
    n += 1;
    let tmpToBin = n.toString(2);

    for (let i = 0; i < tmpToBin.length; i++) {
      if (tmpToBin[i] === "1") {
        tmpCount += 1;
      }
    }

    if (tmpCount == oneCount) {
      answer = n;
      break;
    }
  }

  return answer;
}

solution(78);
