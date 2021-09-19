package pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces=spaces+1;
			}
			int j=1;
			int val=i;
			while(j<=i) {
				System.out.print(val);
				val=val+1;
				j=j+1;
			}
			int dec=1;
			val=2*i-2;
			while(dec<=i-1) {
				System.out.print(val);
				dec+=1;
				val-=1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
