function solution(numbers) {
    var answer = [];
    for(let num of numbers){
        let multiNum = num * 2;
        answer.push(multiNum);
    }
    return answer;
}