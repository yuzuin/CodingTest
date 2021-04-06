package human;

public class test210324_4 {

	public static void main(String[] args) {

		int[] a = {1,2,3,0,0,0,0,0,2,1};
		/* 서로 근접해 있는 최대 빈칸은 모두 몇 개인가? 정답:5 */

		int[] aa = {1,2,3,0,0,0,1,0,0,0,0,3,4};

		/* 서로 근접해 있는 최대 빈칸은 모두 몇 개인가? 정답 : 4 */
		
		int[] aaa = {1,2,3,0,0,0,0,5,6,5,9,0,0,0,6,0,0,0,0,0,0,0,3,2,6,0,0,0,0};
		System.out.println("답 : "+solution2(a,0,0,0));
		System.out.println("답 : "+solution2(aa,0,0,0));
		System.out.println("답 : "+solution2(aaa,0,0,0));
	}
	
	/** 재귀함수 X */
	public static int solution(int[] arr) {
		int cnt=0;
		int answer=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				cnt++;
			}else {
				if(answer<=cnt) {
					answer=cnt;
				}
				cnt=0;
			}
		}
		return answer;
	}
	
	public static int solution2(int[] arr, int i, int cnt, int answer) {
		if(i>=arr.length) {
			return answer;
		}else {
			if(arr[i]==0) {
				cnt++;
				return solution2(arr,i+1,cnt,answer);
			}else {
				if(answer<cnt) {
					return solution2(arr,i+1,0,cnt);
				}else {
					return solution2(arr,i+1,0,answer);
				}
			}
		}
	}
}
