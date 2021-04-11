package note;

import java.io.*;
import java.lang.*;
import java.util.*;


class financialdatasystem_4{
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int caseSize = scanner.nextInt();

		for(int i = 0 ; i < caseSize ; i ++)
		{ 
			int input = scanner.nextInt();
			if(financialdatasystem_4.isPerfectNumber(input))
			{
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		}
		
		scanner.close();
	}
	public static boolean isPerfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++){
			if(n%i==0&&n!=i){
				sum+=i;
			}
		}
		if(sum==n){
			return true;
		}
		return false;
	}
}
