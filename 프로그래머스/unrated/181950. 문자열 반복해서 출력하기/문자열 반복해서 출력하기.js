const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", function (line) {
  input = line.split(" ");
}).on("close", function () {
  str = input[0];
  n = Number(input[1]);
  let result = "";
  for (let i = 0; i < input[1]; i++) {
    result += input[0];
  }

  console.log(result);
});