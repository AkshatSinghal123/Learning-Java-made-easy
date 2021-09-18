package pattern;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		int val=1;
		while(i<=num) {
			int space=1;
			while(space<=(num-i)) {
			    System.out.print(" ");
			    space=space+1;
			}
			int j=1;
			while(j<=i) {
				System.out.print(val);
				val=val+1;
				j=j+1;
			}System.out.println();
			i=i+1;
		}
	}

}
