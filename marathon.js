// function solution(participant, completion) {
//   let answer;
//   const participantMap = new Map();
//   const completionMap = new Map();
//   participant.sort();
//   completion.sort();

//   let participantNum = 0;
//   for (let i = 0; i < participant.length; i++) {
//     if (participantMap.has(`${participant[i]}${participantNum}`)) {
//       participantNum += 1;
//       participantMap.set(`${participant[i]}${participantNum}`, participant[i]);
//     } else {
//       participantNum = 0;
//       participantMap.set(`${participant[i]}${participantNum}`, participant[i]);
//     }
//   }

//   let completionNum = 0;
//   for (let i = 0; i < completion.length; i++) {
//     if (completionMap.has(`${completion[i]}${completionNum}`)) {
//       completionNum += 1;
//       completionMap.set(`${completion[i]}${completionNum}`, completion[i]);
//     } else {
//       completionNum = 0;
//       completionMap.set(`${completion[i]}${0}`, completion[i]);
//     }
//   }

//   for (let key of participantMap.keys()) {
//     if (!completionMap.has(key)) {
//       answer = participantMap.get(key);
//     }
//   }

//   console.log(participantMap);
//   console.log(completionMap);

//   return answer;
// }

function solution(participant, completion) {
  participant.sort();
  completion.sort();

  let answer;

  for (let i = 0; i < participant.length; i++) {
    if (participant[i] !== completion[i]) {
      answer = participant[i];
      break;
    }
  }

  return answer;
}

solution(["mislav", "stanko", "ana", "mislav"], ["stanko", "ana", "mislav"]);
