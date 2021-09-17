package second;
import java.util.Scanner;
public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
        int cv=S;
        while(cv<=E) {
        	int F=(int)((5.0/9)*(cv-32));
        	System.out.println(cv+"\t"+F);
            cv=cv+W;
        }
	}

}
