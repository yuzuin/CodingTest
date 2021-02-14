package programmers;
import java.util.*;

class Solution {
	/* 레벨1. 두 개 뽑아서 더하기 */
    public int[] solution(int[] numbers) {
        Set<Integer> numSet = new HashSet<>(); //	중복이 안되는 해시셋

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                numSet.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[numSet.size()];
        int idx = 0;
        for(int num: numSet) {
            answer[idx++] = num; 
        }
        Arrays.sort(answer);

        return answer;
    }
}
