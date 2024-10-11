import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        //너비탐색
        Queue<Integer> queue = new LinkedList<>();
        //확인한 숫자
        Set<Integer> checked = new HashSet<>();
        //연산횟수
        Map<Integer, Integer> ways = new HashMap<>();
        
        queue.offer(x);
        checked.add(x);
        ways.put(x, 0);
        
        while(!queue.isEmpty()) {
            int queueNum = queue.poll();
            
            //같은지 확인
            if (queueNum == y) {
                return ways.get(queueNum);
            }
            
            int[] calculateNum = { queueNum + n, queueNum * 2, queueNum * 3 };
            
            for(int item : calculateNum) {
                if (item <= y && !checked.contains(item)) {
                    queue.offer(item);
                    checked.add(item);
                    ways.put(item, ways.get(queueNum) + 1);
                }
            }
             
        }

        return -1;
    }
}