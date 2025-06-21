package javaBasic;
import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double Decimal = 0;
		double j = 0;
		while(n!= 0) {
			double multiplier = Math.pow(2, j);
			int remainder = n%10;
			Decimal=Decimal+(remainder*multiplier);
			j++;
			n = n/10;
		}
		System.out.println(Decimal);
	}
}
