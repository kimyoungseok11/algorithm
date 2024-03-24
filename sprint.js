function solution(players, callings) {
  callings.forEach((elem) => {
    let index = players.indexOf(elem);
    let temp = players[index - 1];
    players.splice(index - 1, 1, elem);
    // players[index - 1] = elem;
    // players[index] = temp;
  });
  return players;
}
