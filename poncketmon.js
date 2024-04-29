function solution(nums) {
  const pickNum = nums.length / 2;
  const answers = [];

  const ponkemons = new Set(nums);
  const pokeArr = [...ponkemons];

  for (let i = 0; i < pickNum; i++) {
    if (!answers.includes(pokeArr[i]) && pokeArr[i]) {
      answers.push(pokeArr[i]);
    }
  }

  console.log(answers);
  console.log(answers.length);

  return answers.length;
}

solution([3, 3, 3, 2, 2, 2]);
