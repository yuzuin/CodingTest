package programmers;

import java.util.ArrayList;

public class lesson42840 {
	/* 모의고사 */
	public static void main(String[] args) {
		int[] arr = {1,3,2,4,2};
		System.out.println(solution(arr));

	}

	public static ArrayList<Integer> solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int o = 0;
		int t = 0;
		int th = 0;
		int go1 = 0;
		int go2 = 0;
		int go3 = 0;

		for (int i = 0; i < answers.length; i++) {
			if (one[go1] == answers[i]) {
				o++;
			}
			if (two[go2] == answers[i]) {
				t++;
			}
			if (three[go3] == answers[i]) {
				th++;
			}
			if (go1 == 4) {
				go1 = 0;
			} else {
				go1++;
			}
			if (go2 == 7) {
				go2 = 0;
			} else {
				go2++;
			}
			if (go3 == 9) {
				go3 = 0;
			} else {
				go3++;
			}
		}
		if (t > o) {
			if (t > th) {
				answer.add(2);
			} else if (th > t) {
				answer.add(3);
			}else if(th==t) {
				answer.add(2);
				answer.add(3);
			}
		} else if (t < o) {
			if (o > th) {
				answer.add(1);
			} else if (o < th) {
				answer.add(3);
			}else if(o==th) {
				answer.add(1);
				answer.add(3);
			}
		} else if (t == o) {
			if (t > th) {
				answer.add(1);
				answer.add(2);
			} else if (t < th) {
				answer.add(3);
			} else if (t == th) {
				answer.add(1);
				answer.add(2);
				answer.add(3);
			}
		}

		return answer;
	}
}
