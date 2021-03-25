package human;

public class test210324_3 {

	public static void main(String[] args) {
		//	10! 구하기
		System.out.println(fact(10));
	}
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}
