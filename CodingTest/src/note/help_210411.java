package note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class help_210411 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		while(true) {
			String word = sc.nextLine();
			if(word.equals("quit")) {
				break;
			}
			int a = word.charAt(0);
			arr.add(a);
		}
		Collections.sort(arr);
		int word = arr.get(0);
		System.out.println((char)word);
	}
}
