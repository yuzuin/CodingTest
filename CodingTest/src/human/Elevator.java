package human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Elevator {

	static ArrayList<Integer> btn = new ArrayList<>();
	public static void main(String[] args) {
		PushBtn();
		btn.add(23);btn.add(4);btn.add(6);btn.add(10);btn.add(17);
		goUp(7);	//	7층에서 시작
	}
	public static void goUp(int n) {	//	올라가는 동작
		System.out.println("올라갑니다.");
		int last = 0;
		for(int i = n;i<26;i++) {
			Collections.sort(btn);		//	버튼 정렬
			try {
				Thread.sleep(1000);
				if(btn.contains(i)) {
					System.out.println("올라가다 "+i+"층에서 멈춤");
					int index = btn.indexOf(i);
					last = btn.get(btn.size()-1);	//	버튼에서 가장 큰 값 (올라가는 중 마지막 층)
					btn.remove(index);	//	버튼값 삭제
					if(last==i) {	//	버튼의 가장 큰 값이 현재 층이면
						break;
					}
				}else {
					System.out.println(i+"층 ...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(btn.size()!=0) {	//	버튼이 남아있으면
			goDown(last-1);
		}else {
			System.out.println("엘리베이터 멈춤");
			System.exit(0);
		}
	}
	
	public static void goDown(int n) {	//	내려가는 동작
		System.out.println("내려갑니다.");
		int last = 0;
		for(int i = n;i>0;i--) {
			Collections.sort(btn);		//	버튼 정렬
			try {
				Thread.sleep(1000);
				if(btn.contains(i)) {
					System.out.println("내려가다 "+i+"층에서 멈춤");
					int index = btn.indexOf(i);
					last = btn.get(0);	//	버튼에서 가장 작은 값 (내려가는 중 마지막 층)
					btn.remove(index);	//	버튼값 삭제
					if(last==i) {	//	가장 작은 값이 현재 층이면
						break;
					}
				}else {
					System.out.println(i+"층 ...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(btn.size()!=0) {	//	버튼이 남아있으면 (누가누르면)
			goUp(last+1);
		}else {
			System.out.println("엘리베이터 멈춤");
			System.exit(0);
		}
	}
	
	/* 버튼을 누르는 멀티스레드 */
	static Scanner push = new Scanner(System.in);
	public static void PushBtn() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					int p =push.nextInt();
					push.nextLine();
					if(p>0&&p<26) {
						btn.add(p);
					}else {
						System.out.println("1~25층까지 입력하세요.");
					}
				}
			}
		}).start();
	}
}
