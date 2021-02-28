package human;

public class test210225 {

	public static void main(String[] args) {
		People[] memberList = new People[5];
		for(int i=0;i<=3;i++) {
			memberList[i] = new People();
		}
		for(int i=0;i<5;i++) {
			if(i<4) {
				System.out.println(memberList[i].name);
				
			}
		}
	}
	
	public static class People{
		String name=null;
		String id=null;
	}
}
