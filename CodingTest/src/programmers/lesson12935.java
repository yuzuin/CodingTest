package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class lesson12935 {

	public static void main(String[] args) {
		int[] arr = {6,2,4,8,5,10,6,8,1,3,2,4};
		System.out.println(solution(arr));
	}
	public static int[] solution(int[] arr) {
		int[] answer;
		if(arr.length==1){
			answer = new int[1];
			answer[0]=-1;
			return answer;
		}
		answer = new int[arr.length-1];	//	하나만 뺀 값들
		int min = 2147483647;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min은 "+min);
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=min){
            	System.out.println("min 출"+arr[j]);
                answer[i]=arr[j];
                i++;
            }else {
            	min=0;
            }
        }
        for(i=0;i<answer.length;i++) {
        	System.out.println(answer[i]);
        }
		return answer;
	}
}
