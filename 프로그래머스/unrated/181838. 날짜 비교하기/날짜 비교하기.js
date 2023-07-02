function solution(date1, date2) {
    let date1ToDate = new Date(date1[0], date1[1] - 1, date1[2]);
    let date2ToDate = new Date(date2[0], date2[1] - 1, date2[2]);

    return date1ToDate < date2ToDate ? 1 : 0;
}