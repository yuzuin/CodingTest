package programmers;

public class lesson42747 {
	/* H-Index */
	public static void main(String[] args) {
		int[] arr = {2,2,2};
		System.out.println(solution(arr));
	}
	public static int solution(int[] citations) {
        for(int i=citations.length;i>0;i--){
            int cnt = 0;
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=i){
                    cnt++;
                }
            }
            //	몇 건인지 센 cnt와 i중 작은 값을 리턴해야함 
            //	예 : {2,2,2}일 시 3이 아닌 2가 리턴되어야 함
            if(cnt>=i){
            	return Math.min(cnt, i);
            }
        }
        return 0;
    }
}
