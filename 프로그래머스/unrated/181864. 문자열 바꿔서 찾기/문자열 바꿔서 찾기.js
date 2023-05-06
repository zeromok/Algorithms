function solution(myString, pat) {
    let sorted = myString.split("").map((item) => {
      if (item === "A") return item = "B"
      if (item === "B") return item = "A"
   }).join("");
   return sorted.includes(pat) ? 1 : 0;
}