function solution(i, j, k) {
    let result = 0;

    for (let n = i; n <= j; n++) {
        if (n.toString().includes(k.toString()))
          result += n
            .toString()
            .split("")
            .filter((str) => str === k.toString()).length;
    }
    return result;
}