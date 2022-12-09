// readline 모듈 불러오기
const readline = require('readline');

// 인터페이스 생성하기
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

// 입출력을 처리하는 코드
rl.on('line', function (line) {

    // 입력 값을 받아 수행 할 코드
    for(let i=0; i<line; i++) {
        for(let j=0; j<=i; j++) {
            process.stdout.write('*');
        }
        console.log();
    }

    // 코드가 실행된 후 닫아주기 -> 무한입력 방지
    rl.close();

}).on('close', function () {

    // 프로세스 종료
    process.exit();
});
/*
    require('파일 경로') :
        외부모듈을 가져오는 함수
        Ex) 위 문제에서는 readline 모듈을 사용함

    createInterface() :
        readline.Interface 인스턴스를 생성한다.

    readline.Interface()의 인스턴스 rl :
        readline.Interface 가 내장한 이벤트틀을 실행한다.
        Ex) line, close

    
    다른 접근법 :
    각각의 값들을 담을 빈 배열 선언
    let input = [];

    rl.on('line', function (line) {
        input = line.split(' ');
    }).on('close', function () {
        const num = Number(input[0]);
        let logStr = ''
        for(let i = 0 ; i < num; i++) {
            for(let j = 0 ; j <= i; j++) {
                logStr+='*'
            }
            logStr+='\n'
        }
        console.log(logStr)
    });
*/