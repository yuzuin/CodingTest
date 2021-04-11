package note;
import java.io.*;
import java.lang.*;
import java.util.*;

public class financialdatasystem_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long decimal = scanner.nextLong();
		int answer = Util.intLength(decimal);
		System.out.println(answer);
	}
}

class Util {
	/**
	 * @brief 64비트 정수형 변수 'decimal'의 텍스트 길이를 반환해주는 함수
	 * 
	 * @param decimal 길이를 구할 64비트 정수
	 * @return int 'decimal'의 텍스트 길이
	 */
	public static int intLength(long decimal) {
		int length = 0;
		String cnt = String.valueOf(decimal);
		length = cnt.length();

		return length;
	}
}