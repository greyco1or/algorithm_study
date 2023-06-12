function solution(s) {
    var answer = '';
    let str = s.toLowerCase();
    let arr = str.split("");
    let tmp = " ";
    for(let v of arr) {
        if(tmp == " ") {
            tmp = v;
            let upCase = v.toUpperCase();
            console.log(upCase);
            answer += upCase;
        } else {
            tmp = v;
            answer += v;
        }
    }
    return answer;
}