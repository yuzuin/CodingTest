package programmers;

public class lesson42577 {

	/* 전화번호 목록 */
	public static void main(String[] args) {

	}
	class Solution {
	    public boolean solution(String[] phone_book) {
	        for(int i=0;i<phone_book.length;i++){
	            for(int j=0;j<phone_book.length;j++){
	                if(i!=j){
	                    if(phone_book[j].indexOf(phone_book[i])==0){
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }
	}
}
