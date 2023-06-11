function solution(n) {
    var answer = 0;
    let str = n.toString();
    for(let v of str) {
        answer += Number(v);
    }
    
    return answer;
}