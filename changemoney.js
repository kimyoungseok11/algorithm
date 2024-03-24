function changeMoney(money) {
  const coins = [500, 100, 50, 10];
  const coinCount = [];
  coins.forEach((coin) => {
    let count = money / coin;
    count = Math.floor(count);
    // let
    money -= count * coin;
    coinCount.push(count);
  });
  return coinCount;
}
console.log(changeMoney(10000));
