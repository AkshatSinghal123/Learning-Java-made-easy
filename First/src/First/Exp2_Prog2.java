package First;

public class Exp2_Prog2 {
   public static void main(String[] args) {
	   int i = Integer.parseInt(args[0]);
	   int j = Integer.parseInt(args[2]);
	   
	   if(args[1].equals("+"))
		   System.out.println("The sum is:- "+(i+j));
	   else if(args[1].equals("-"))
		   System.out.println("The sum is:- "+(i-j));
	   else if(args[1].equals("*"))
		   System.out.println("The sum is:- "+(i*j));
	   else
		   System.out.println("The sum is:- "+(i/j));
   }
}
