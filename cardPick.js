function cardPick(arraySize, cards) {
  const [row, col] = arraySize.split(" ").map(Number);
  let result = 0;
  cards.forEach((card) => {
    console.log(card);
    result = Math.min.apply(null, card);
    if (result < Math.min.apply(null, card)) {
      result = Math.min.apply(null, card);
    }
  });
  console.log(result);
  return result;
}
