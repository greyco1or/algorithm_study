function solution(s) {
    var answer = s.split(" ");

    for(var i=0; i<answer.length; i++){
        answer[i] = answer[i].substring(0,1).toUpperCase() + answer[i].substring(1).toLowerCase();
    }

    return answer.join(" ");
}