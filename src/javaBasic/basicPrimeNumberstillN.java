package javaBasic;
import java.util.Scanner;

public class basicPrimeNumberstillN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//Print all Prime numbers till n
		for(int i=2;i<=n;i++) {
			boolean isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i + " is a Prime Number");
			}
		}
	}
}
