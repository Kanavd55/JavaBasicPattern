package javaBasic;
import java.util.Scanner;

public class SquareRoot {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int squareRoot = 0;
		for(int i=0;i<=n;i++) {
			int result = i*i;
			if(result<=n) {
				squareRoot = i;
			}
		}
		System.out.println(squareRoot);
		
	}
}
