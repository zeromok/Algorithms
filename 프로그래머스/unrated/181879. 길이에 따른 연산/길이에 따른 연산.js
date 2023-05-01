function solution(num_list) {
    if(num_list.length >= 11) {
        let result = num_list.reduce((acc, curr) => acc += curr );
        return result
    }else if(num_list.length <= 10) {
        let result = num_list.reduce((acc, curr) => acc *= curr );
        return result
    }
}