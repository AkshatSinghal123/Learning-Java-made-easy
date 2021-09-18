package second;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
    int i=2;
    int flag=0;
    while (i<num) {
    	if(num%i==0) {
    		flag=1;
    		break;
    	}
    	else {
    		flag=0;
    	}
    	i=i+1;
    }
    if(flag==0) {
    	System.out.println("The entered number is a prime number");
    }
    else if(flag==1){
    	System.out.println("Not a prime number");
    }
	}

}
