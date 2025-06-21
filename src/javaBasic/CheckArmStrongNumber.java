//Problem statement
//You are given an integer 'n'. Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.
//
//
//An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.

package javaBasic;
import java.util.Scanner;

public class CheckArmStrongNumber {
	public static boolean main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int multiplier = 0;
		int newNum=n;
		double sum = 0;
		while(newNum>0) {
			multiplier ++;
			newNum = newNum/10;
		}
		newNum = n;
		while(newNum>0) {
			int remainder = newNum%10;
			sum = sum + Math.pow(remainder, multiplier);
			newNum=newNum/10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
}
