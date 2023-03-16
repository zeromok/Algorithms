function solution(letter) {
    let morse = { '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
                '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
                '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
                '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
                '-.--':'y','--..':'z'};
    let result = "";
        for(let i = 0; i<letter.length; i++) {
            for (let str in morse) {
                if (letter.split(" ")[i] === str) {
                    result += morse[str];
                }
            }
        }
        return result;
}

console.log(solution(".... . .-.. .-.. ---"));
/*
* Refactor
    function Solution(letter) {
        let result = "";
        for (let i = 0; i < letter.split(" ").length; i++) {
            result += morse[letter.split(" ")[i]];
        }
        return result;
    }

*/