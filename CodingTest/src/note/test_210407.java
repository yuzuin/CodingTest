package note;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class test_210407 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int T = Integer.parseInt(br.readLine());	//	수식의 수 T
		StringTokenizer st;
		ArrayList<Integer> arr;
		for(int i=0;i<T;i++){
			arr = new ArrayList<>();
			st = new StringTokenizer(br.readLine(),"+");
			
			while(st.hasMoreTokens()){
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			Collections.sort(arr);
			String answer="";
			for(int j=0;j<arr.size();j++) {
				answer+=arr.get(j)+"+";
			}
			
			System.out.println(answer.substring(0,answer.length()-1));
		}
		
	}

}
