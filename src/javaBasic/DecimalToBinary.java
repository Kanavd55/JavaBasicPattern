package javaBasic;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int Decimal = s.nextInt();
		int Binary = 0;
		int multiplier = 1;
		while(Decimal>0) {
			int remainder = Decimal % 2;
			Binary = Binary + multiplier * remainder;
			multiplier = multiplier * 10;
			Decimal = Decimal / 2;
		}
		System.out.println(Binary);
	}
}
