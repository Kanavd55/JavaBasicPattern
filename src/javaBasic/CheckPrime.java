package javaBasic;
import java.util.Scanner;
public class CheckPrime {
	
	public static boolean checkPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean result = checkPrime(n);
		System.out.println(result);
	}
}
