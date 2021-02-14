package programmers;


/*문자열 내 p와 y의 개수*/
class lesson12916 {
    boolean solution(String s) {
        boolean answer = true;
        
        /*cnt만을 이용하여 ++와 --로 하는 방법도 있음..*/
        int cntP = 0;
        int cntY = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){
                cntP++;        
            }
            if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                cntY++;
            }
        }

        answer = cntP==cntY;

        return answer;
    }
}