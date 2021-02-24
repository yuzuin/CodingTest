package programmers;

public class lesson72410 {

	public static void main(String[] args) {
		System.out.println(solution("=.="));
	}
	
	public static String solution(String new_id) {
		// 1단계 전부 소문자
		new_id = new_id.toLowerCase();
		System.out.println("1단계 " + new_id);

		// 2단계 숫자,영어,_,-,. 외 이상한 문자 거르기
		for (int i = 0; i < new_id.length(); i++) {
			char temp = new_id.charAt(i);
			if (temp != '-' && temp != '_' && temp != '.' && !(temp >= 48 && temp <= 57)
					&& !(temp >= 97 && temp <= 122)) {
				new_id = new_id.replace(String.valueOf(new_id.charAt(i)), "");
				i--; // 공백을 replace 하고 나면 글자 길이가 줄어듦
			}
		}
		System.out.println("2단계 " + new_id);

		// 3단계 ..
		for (int i = 1; i < new_id.length(); i++) {
			if (new_id.charAt(i) == '.' && new_id.charAt(i - 1) == '.') {
				new_id = new_id.substring(0, i) + new_id.substring(i + 1, new_id.length());
				i--;
			}
		}
		System.out.println("3단계 " + new_id);

		// 첫, 끝 . 제거
		if (new_id.charAt(0) == '.') {
			new_id = new_id.substring(1, new_id.length());
		}
		if (new_id.length() > 0) {
			System.out.println("실행");
			if (new_id.lastIndexOf(".") == new_id.length() - 1) {
				new_id = new_id.substring(0, new_id.length() - 1);
			}
		}
		System.out.println("4단계 " + new_id);

		// 빈문자열
		if (new_id.equals("")) {
			new_id = "a";
		}
		System.out.println("5단계 " + new_id);

		// 16자이상
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			while (true) {
				if (new_id.charAt(new_id.length() - 1) == '.') {
					new_id = new_id.substring(0, new_id.length() - 1);
				} else {
					break;
				}
			}
		}

		System.out.println("6단계 " + new_id);

		// 2자 이하
		if (new_id.length() < 3) {
			while (new_id.length() < 3) {
				new_id = new_id + new_id.charAt(new_id.length() - 1);
			}
		}
		return new_id;
	}
}
