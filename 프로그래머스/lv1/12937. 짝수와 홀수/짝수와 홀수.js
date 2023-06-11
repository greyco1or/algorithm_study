function solution(num) {
    var answer = '';
    switch (num%2) {
        case 1 : 
            answer = "Odd"
            break;
        case 0 :
            answer = "Even"
            break;
        case -1 :
            answer = "Odd"
    }        
    return answer;
}