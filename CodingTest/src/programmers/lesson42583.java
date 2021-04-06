package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class lesson42583 {

	public static void main(String[] args) {
		int[] arr = {7,4,5,6};
		int a = solution(2, 10, arr);
		System.out.println(a);
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		int max=0;
		for(int w : truck_weights) {
			while(true) {
				if(queue.isEmpty()) {
					queue.offer(w);
					max+=w;
					answer++;
					break;
					
				}else if(queue.size()==bridge_length) {
					max-=queue.poll();
				}else {
					if(max+w>weight) {
						queue.offer(0);
						answer++;
					}else {
						queue.offer(w);
						max+=w;
						answer++;
						break;
					}
				}
			}
			
		}
		return answer+bridge_length;
	}
}
