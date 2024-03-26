function solution(babbling) {
  const words = ["aya", "ye", "woo", "ma"];
  const resultArray = [];

  babbling.forEach((bab) => {
    for (let i = 0; i < words.length; i++) {
      if (bab.includes(words[i].repeat(2))) {
        break;
      }

      bab = bab.split(words[i]).join(" ");
      console.log(bab);
    }

    if (bab.split(" ").join("").length === 0) {
      resultArray.push(bab);
    }
  });

  return resultArray.length;
}

solution(["ayaye", "uuu", "yeye", "yemawoo", "ayaayaya"]);
