function solution(num_list) {
    let [secondLast, last] = num_list.slice(-2);
    let result = [...num_list]
    if (secondLast < last) result.push(last - secondLast);
    if (secondLast >= last) result.push(last * 2);
    return result;
}