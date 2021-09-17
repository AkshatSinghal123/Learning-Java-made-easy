package First;

public class Exp2_Prog1 {
         public static void main(String args[]) {
        	 int a = 20;
             int b = 10;
             int c = 30;
              
             int largest;
              
             //find the largest
             if(a>b) {
                 if(a>c) {
                     largest = a;
                 } else {
                     largest = c;
                 }
             } else {
                 if(b>c) {
                     largest = b;
                 } else {
                     largest = c;
                 }
             }
              
             System.out.println(largest + " is the largest.");
         }
     }
