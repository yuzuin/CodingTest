package note;

import java.util.HashMap;

public class hash_test {
	public static void main(String args[]) {
		HashMap<String , Integer> map = new HashMap<String , Integer>();

	    map.put("신논현", 1);
	    map.put("강남", 2);
	    map.put("혜화", 3);
	    map.put("안양", 4);
	    map.put("수원", 5);

	    System.out.println(map.values());
	}

}
