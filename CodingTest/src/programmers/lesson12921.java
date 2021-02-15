package programmers;

public class lesson12921 {

	public static void main(String[] args) {
		/* 1~n까지의 숫자 중 소수 */
		a(30);
		
	}
	
	public static void a(int n) {
		  int answer = 0;
	        boolean[] arr = new boolean[n+1];

	        for(int i=2;i<=n;i++){
	            if(!arr[i]) answer++;
	            for(int j=i;j<=n;j+=i){
	                if(!arr[j]) arr[j]=true;
	            }
	        }
	        System.out.println(answer);
	}
}
