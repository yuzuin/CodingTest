package programmers;

import java.util.ArrayList;

public class lesson64061 {
	
	/* 크레인 인형 뽑기 게임
	 * 스택을 공부하자 ... */
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board,moves));;
	}
	public static int solution(int[][] board, int[] moves) {
		 int answer = 0;
	        ArrayList<Integer> arr = new ArrayList<>();
	        
	        for(int i=0;i<moves.length;i++){
	            for(int j=0;j<board.length;j++){
	                if(board[j][moves[i]-1]!=0){
	                    arr.add(board[j][moves[i]-1]);
	                    System.out.println("arr: "+arr);
	                    board[j][moves[i]-1]=0;
	                    if(arr.size()>1){
	                    	System.out.println("현재 arr "+arr);
	                    	if(arr.get(arr.size()-1)==arr.get(arr.size()-2)){
	                    		answer++;
	                    		arr.remove(arr.size()-1);
	                    		arr.remove(arr.size()-1);
	                    		for(int r=1;r<arr.size();r++){
	                    			if(arr.get(r)==arr.get(r-1)){
	                    				arr.remove(r);
	                    				arr.remove(r-1);
	                    				answer++;
	                    				r=r-2;
	                    			}
	                    		}
	                    	}
	                    	System.out.println("if문돌고 arr:"+arr);
	                    }
	                    break;
	                }
	            }
	        }
	        return answer;
	}
}
