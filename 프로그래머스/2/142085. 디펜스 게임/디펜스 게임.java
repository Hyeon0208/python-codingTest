import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        
        if (k == enemy.length) {
            return enemy.length;
        }
        
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < enemy.length; i++) {
			pq.add(enemy[i]);
			n -= enemy[i];
            
			if (n < 0) {
				if (k > 0 && !pq.isEmpty()) {
					n += pq.poll();
					k--;
				} else {
					break;
				}
			}
			answer++;
        }
        return answer;
    }
}