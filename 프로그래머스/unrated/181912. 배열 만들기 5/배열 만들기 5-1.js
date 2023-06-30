function solution(intStrs, k, s, l) {
    return intStrs.map(item => Number(item.substring(s, s + l)))
        .filter((item) => k < item)
}