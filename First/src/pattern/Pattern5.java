package pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		while(i<=num) {
			int j=1;
			int space=1,space1=1;
			while(space<=(num-i)) {
				System.out.print(" ");
				space=space+1;
			}
			while(j<=(2*i-1)) {
				System.out.print("*");
				j=j+1;
			}System.out.println();
			i=i+1;
		}

	}

}
