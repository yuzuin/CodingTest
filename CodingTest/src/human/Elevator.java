package human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Elevator {

	static ArrayList<Integer> btn = new ArrayList<>();
	public static void main(String[] args) {
		PushBtn();
		btn.add(23);btn.add(4);btn.add(6);btn.add(10);btn.add(17);
		goUp(7);	//	7������ ����
	}
	public static void goUp(int n) {	//	�ö󰡴� ����
		System.out.println("�ö󰩴ϴ�.");
		int last = 0;
		for(int i = n;i<26;i++) {
			Collections.sort(btn);		//	��ư ����
			try {
				Thread.sleep(1000);
				if(btn.contains(i)) {
					System.out.println("�ö󰡴� "+i+"������ ����");
					int index = btn.indexOf(i);
					last = btn.get(btn.size()-1);	//	��ư���� ���� ū �� (�ö󰡴� �� ������ ��)
					btn.remove(index);	//	��ư�� ����
					if(last==i) {	//	��ư�� ���� ū ���� ���� ���̸�
						break;
					}
				}else {
					System.out.println(i+"�� ...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(btn.size()!=0) {	//	��ư�� ����������
			goDown(last-1);
		}else {
			System.out.println("���������� ����");
			System.exit(0);
		}
	}
	
	public static void goDown(int n) {	//	�������� ����
		System.out.println("�������ϴ�.");
		int last = 0;
		for(int i = n;i>0;i--) {
			Collections.sort(btn);		//	��ư ����
			try {
				Thread.sleep(1000);
				if(btn.contains(i)) {
					System.out.println("�������� "+i+"������ ����");
					int index = btn.indexOf(i);
					last = btn.get(0);	//	��ư���� ���� ���� �� (�������� �� ������ ��)
					btn.remove(index);	//	��ư�� ����
					if(last==i) {	//	���� ���� ���� ���� ���̸�
						break;
					}
				}else {
					System.out.println(i+"�� ...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(btn.size()!=0) {	//	��ư�� ���������� (����������)
			goUp(last+1);
		}else {
			System.out.println("���������� ����");
			System.exit(0);
		}
	}
	
	/* ��ư�� ������ ��Ƽ������ */
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
						System.out.println("1~25������ �Է��ϼ���.");
					}
				}
			}
		}).start();
	}
}
