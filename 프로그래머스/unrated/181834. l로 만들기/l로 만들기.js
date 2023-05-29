function solution(myString) {
    return myString.split("")
        .map(item => {
            return item.charCodeAt() < 108 ?  "l" : item;
        })
        .join("")
}