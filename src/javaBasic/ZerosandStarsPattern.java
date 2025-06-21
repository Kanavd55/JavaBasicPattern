//Print the following pattern
//
//Pattern for N = 4
//
//*000*000*
//0*00*00*0
//00*0*0*00
//000***000

package javaBasic;
import java.util.Scanner;

public class ZerosandStarsPattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1; j<= n ; j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.print("*");
			for(int j = 1; j<= n; j++) {
				if(j==n-i+1) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
