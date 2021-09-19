package pattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int firsthalf=(n+1)/2;
		int secondhalf=firsthalf-1;
		int i=1;
		while(i<=firsthalf) {
			int spaces=1;
			while(spaces<=firsthalf-i) {
				System.out.print(" ");
				spaces=spaces+1;
			}
			int j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		 i=secondhalf;
		 while(i>=1) {
			 int spaces=1;
			 while(spaces<=(secondhalf-i+1)) {
				 System.out.print(" ");
				 spaces=spaces+1;
			 }
			 int j=1;
			 while(j<=(2*i-1)) {
				 System.out.print("*");
				 j+=1;
			 }System.out.println();
			  i=i-1;
		 }

	}

}
