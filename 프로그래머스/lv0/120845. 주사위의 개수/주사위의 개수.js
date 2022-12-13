function solution(box, n) {
    let result = box.map( (e) => {return Math.floor(e/n)} ).reduce( (acc, cur) => {return acc * cur },1 );
    return result;
}