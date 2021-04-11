package note;

import java.io.*;
import java.util.*;

class financialdatasystem_queue {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		String answer = "";
		Queue<String> q = new LinkedList<>();
		
		for (int i = 0; i < input; i++) {
			String de = br.readLine();
			if (de.equals("d") || de.equals("D")) {
				if (q.isEmpty()) {
					System.out.println("underflow");
				} else {
					q.poll();
				}
			} else if (de.equals("e") || de.equals("E")) {
				q.offer(br.readLine());
			} else {
				while (!q.isEmpty()) {
					answer += q.poll() + " ";
				}
				System.out.println(answer.substring(0, answer.length() - 1));
				break;
			}

		}
		while (!q.isEmpty()) {
			answer += q.poll() + " ";
		}
		System.out.println(answer.substring(0, answer.length() - 1));
	}
}
