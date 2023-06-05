function solution(binomial) {
    const parts = binomial.split(" ");
    const num1 = Number.parseInt(parts[0]);
    const num2 = Number.parseInt(parts[2]);

    if (binomial.includes("+")) return num1 + num2;
    if (binomial.includes("-")) return num1 - num2;
    if (binomial.includes("*")) return num1 * num2;
    if (binomial.includes("*")) return num1 * num2;
}