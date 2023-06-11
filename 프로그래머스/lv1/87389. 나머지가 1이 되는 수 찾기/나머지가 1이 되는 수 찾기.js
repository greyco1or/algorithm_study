function solution(n) {
    var answer = 0;
    for(x=1; x<=1000000; x++) {
        if(n%x == 1) {
            answer = x;
            break;
        }
    }
    return answer;
}