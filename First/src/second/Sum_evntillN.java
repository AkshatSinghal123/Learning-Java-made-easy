package second;
import java.util.Scanner;
public class Sum_evntillN {
      public static void main(String [] args) {
    	  Scanner s=new Scanner(System.in);
    	  int num=s.nextInt();
    	  int i=0,sum=0;
    	  while(i<=num) {
    		  if(i%2==0) {
    			  sum=sum+i;
    		  }
    		  i=i+1;
    	  }
    	  System.out.println(sum);
      }
}
