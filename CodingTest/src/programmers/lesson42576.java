package programmers;
import java.util.Arrays;

public class lesson42576 {
	
	/* 완주하지 못한 선수 */
	class Solution {
		public String solution(String[] participant, String[] completion) {

			Arrays.sort(participant);
			Arrays.sort(completion);
			String answer = participant[participant.length - 1];

			for (int i = 0; i < completion.length; i++) {
				if (!participant[i].equals(completion[i])) {
					return participant[i];
				}
			}
			return answer;
		}
	}
}
