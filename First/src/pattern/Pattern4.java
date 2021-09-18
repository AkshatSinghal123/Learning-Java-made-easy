package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		while(i<=num) {
			int j=1;
			int space=1;
			while(space<=(num-i)) {
				System.out.print(" ");
				space=space+1;
			}
			while(j<=i) {
				System.out.print(i+j-1);
				j=j+1;
			}System.out.println();
			i=i+1;
		}

	}

}
