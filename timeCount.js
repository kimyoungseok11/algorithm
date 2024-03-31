function timeCount(time) {
  let count = 0;
  for (let hour = 0; hour <= time; hour++) {
    for (let min = 0; min < 60; min++) {
      for (let sec = 0; sec < 60; sec++) {
        let timeString = `${hour}시 ${min}분 ${sec}초`;
        if (timeString.indexOf("3") !== -1) {
          count += 1;
        }
      }
    }
  }
  console.log(count);
  return count;
}

timeCount(5);
