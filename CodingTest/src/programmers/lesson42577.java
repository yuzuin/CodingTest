package programmers;

import java.util.HashMap;

public class lesson42577 {

	/* 전화번호 목록 */
	public static void main(String[] args) {
		String[] arr = {"119", "97674223", "1195524421"};
		solution(arr);
	}

	// 정확성 테스트는 통과, 효율성 테스트는 실패...
	class Solution {
		public boolean solution(String[] phone_book) {
			for (int i = 0; i < phone_book.length; i++) {
				for (int j = 0; j < phone_book.length; j++) {
					if (i != j) {
						if (phone_book[j].indexOf(phone_book[i]) == 0) {
							return false;
						}
					}
				}
			}
			return true;
		}
	}
	
	//	아주 미세하게;; 빨라짐
	class Solution2 {
		public boolean solution(String[] phone_book) {
			for (int i = 0; i < phone_book.length; i++) {
				int j = 0;
				while (j < phone_book.length) {
					if (phone_book[j].indexOf(phone_book[i]) == 0&&i!=j) {
						return false;
					}
					j++;
				}
			}
			return true;
		}
	}
	
	//	해시 시도
	class Solution3 {
		public boolean solution(String[] phone_book) {
			HashMap<String,Integer> map = new HashMap();
			for(String nums : phone_book) {
				Integer integer = map.getOrDefault(nums, 0);
				map.put(nums, ++integer);
			}
			for(int i=0;i<map.size();i++) {
				System.out.println(map.get(i));
			}
			return true;
		}
	}
	
	//	해시맵 사용. 확실히 빠르다...
	public static boolean solution(String[] phone_book) {
		HashMap<String,String> hm = new HashMap<>();
		
		/**	해시맵에 phone_book 배열의 값들을 넣어주는 작업
		 * key가 phone_book의 값이고 value는 "prefix"
		 */
		for(int i=0;i<phone_book.length;i++) {
			hm.put(phone_book[i], "prefix");
		}
		
		for(String phone : phone_book) {	//	여기서 phone은? 배열의 값들 순회
			for(int i=0;i<phone.length();i++) {
				/**	containsKey? 맵에 인자로 보낸 키가 있으면 true를 반환한다. 
				/*	phone이 119일 경우, 1이 키에 있는가? 11이 키에 있는가? 119가 키에 있는가? 검사 */
				if(hm.containsKey(phone.substring(0,i))) {
					return false;
				}
			}
		}
		return true;
	}
}
