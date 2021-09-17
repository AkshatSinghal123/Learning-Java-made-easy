package First;

import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char ch = s.next().charAt(0);
		if(ch>=65 && ch <=96) {
			System.out.println("1");
			return;
		}
		if(ch>=97 && ch <=123) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
	}

}
