package programmers;

public class lesson12918 {
	/* 문자열 기본 
	 * 길이가 4나 6이 아니면 false를 리턴
	 * 문자열에 숫자가 아닌 문자가 있으면 false를 리턴 */
	class Solution {
		public boolean solution(String s) {
			boolean answer = true;
			if (s.length() != 4 && s.length() != 6) {
				return false;
			}
			for (int i = 0; i < s.length(); i++) {
				if (!(s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
					return false;
				}
			}
			return answer;
		}
	}

	class Solution2 {
		public boolean solution(String s) {
			if (s.length() == 4 || s.length() == 6) {
				try {
					int x = Integer.parseInt(s);
					return true;
				} catch (NumberFormatException e) {
					return false;
				}

			} else {
				return false;
			}

		}
	}
}
