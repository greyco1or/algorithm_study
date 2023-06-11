function solution(arr) {
    var answer = 0;
    for(let value of arr) {
        answer += value
    }
    return answer/arr.length;
}