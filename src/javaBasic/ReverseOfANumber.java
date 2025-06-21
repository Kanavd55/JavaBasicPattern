package javaBasic;
import java.util.Scanner;

public class ReverseOfANumber {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reverse = 0;
		while(n != 0) {
			int k = n%10;
			if(k!=0) {
				break;
			}else {
				n=n/10;
			}
		}
		while(n!=0) {
			int remainder = n%10;
			reverse = reverse*10+remainder;
			n = n/10;
		}
		System.out.println(reverse);
	}
}
