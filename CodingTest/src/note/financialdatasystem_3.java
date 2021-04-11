package note;

import java.io.*;
import java.util.*;
import java.lang.*;

class financialdatasystem_3 {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		//	id, pw, pw 스캐너로 받기
		String id = scanner.next();
		String pw1 = scanner.next();
		String pw2 = scanner.next();
		String words = "!@#$";	//	포함되어야 하는 특수문자
		
		//	조건을 만족했는지 체크 
		boolean id_chk = true;
		boolean pw_chk = true;

		//	id나 pw가 길이 조건을 만족하지 못하면 false. 으악 pwchk도 false 해주는거 깜빡했다...ㅠㅠ
		//	만족하면 else문으로 넘어감
		if (id.length() < 3 || id.length() > 20 || !(pw1.equals(pw2)) || pw1.length() > 20 || pw1.length() < 8) {
			id_chk = false;
		} else {
			for (int i = 0; i < id.length(); i++) {
				//	id가 소문자인가 체크
				if (id.charAt(i) <= 47 || (id.charAt(i) >= 58 && id.charAt(i) <= 96) || id.charAt(i) >= 123) {
					id_chk = false;
					System.out.println("아이디false");
					break;
				}
			}
			//	그 다음 id가 true이면 
			if (id_chk) {
				//	비밀번호에 특수문자가 포함되어 있는지 체크
				boolean f = false;
				for (int i = 0; i < pw1.length(); i++) {
					for (int j = 0; j < words.length(); j++) {
						if (pw1.charAt(i) == words.charAt(j)) {
							f = true;
							break;
						}
					}
				}
				//	비밀번호에 특수문자가 포함되어 있다면
				if (f) {
					//	이게 무슨...; 암튼 체크
					for (int i = 0; i < pw1.length(); i++) {
						if (pw1.charAt(i) <= 47 && (pw1.charAt(i) >= 58 && pw1.charAt(i) <= 64)
								|| (pw1.charAt(i) >= 91 && pw1.charAt(i) <= 96) || (pw1.charAt(i) >= 123)) {
							pw_chk = false;
							break;
						}
					}
				} else {
					pw_chk = false;
				}

			}
		}
		
		//	최종 체크해서 출력 
		if (id_chk && pw_chk) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
