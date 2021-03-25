package human;

public class test210324_2 {

	public static void main(String[] args) {
		
		//	0번~9번 인덱스에 1~10 입력하고 출력
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
		//	피라미드 별찍기
		for(int i=0;i<4;i++) {	//	엔터치는 for
			//	공백 치는 for
			for(int a=0;a<3-i;a++) {
				System.out.print(" ");
			}
			//	* 치는 for
			for(int b=0;b<i*2+1;b++) {
				System.out.print("*");
			}
			System.out.println();	//	줄 띄기
		}
	}
}
