function solution(s) {
    var answer = '';
    let arr = s.split(" ");
    answer += `${Math.min.apply(null, arr)} ${Math.max.apply(null, arr)}`;
    
    return answer;
}