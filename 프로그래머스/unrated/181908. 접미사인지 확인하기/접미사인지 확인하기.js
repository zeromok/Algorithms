function solution(my_string, is_suffix) {
    if(my_string.length <= is_suffix.length) return my_string ===is_suffix ? 1 : 0;
        return my_string.slice(-1 * is_suffix.length) === is_suffix ? 1 : 0;
}