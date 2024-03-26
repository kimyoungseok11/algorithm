function solution(today, terms, privacies) {
  let answer = [];
  let termObj = {};
  let calDate = [];

  for (let i = 0; i < terms.length; i++) {
    termObj[terms[i].split(" ")[0]] = parseInt(terms[i].split(" ")[1]);
  }

  let privaciesArr = privacies.map((privacy) => {
    return privacy.split(" ");
  });

  for (let i = 0; i < privaciesArr.length; i++) {
    let joinDate = privaciesArr[i][0].split(".").map((pri) => parseInt(pri));
    let dueDate = privaciesArr[i][1];

    if (termObj[dueDate] > 12) {
      let plusYear = Math.floor(termObj[dueDate] / 12);
      let plusMonth = Math.floor(termObj[dueDate] % 12);
      console.log(plusYear, plusMonth);
      joinDate[0] += plusYear;
      joinDate[1] += plusMonth;
      joinDate[2] -= 1;
    } else {
      joinDate[1] = joinDate[1] + termObj[dueDate];
      joinDate[2] -= 1;
    }

    if (joinDate[1] > 12) {
      joinDate[0] += 1;
      joinDate[1] -= 12;
    }

    if (joinDate[2] === 0) {
      joinDate[1] -= 1;
      joinDate[2] = 28;
    }

    calDate.push(joinDate);
  }

  for (let i = 0; i < calDate.length; i++) {
    let [calYear, calMonth, calDay] = calDate[i];
    let [todayYear, todayMonth, todayDay] = today
      .split(".")
      .map((elem) => parseInt(elem));

    console.log(todayYear, todayMonth, todayDay);
    console.log(calYear, calMonth, calDay);

    if (
      todayYear > calYear ||
      (todayYear === calYear && todayMonth > calMonth) ||
      (todayYear === calYear && todayMonth === calMonth && todayDay > calDay)
    ) {
      answer.push(i + 1);
    }
  }
  console.log(answer);
  return answer;
}

solution(
  "2020.01.01",
  ["Z 3", "D 5"],
  [
    "2019.01.01 D",
    "2019.11.15 Z",
    "2019.08.02 D",
    "2019.07.01 D",
    "2018.12.28 Z",
  ]
);
