function f1() {
  let i = 0;

  if (true) {
    let i = 1;
    console.log(i);
  }
  console.log(i);
}

f1();
