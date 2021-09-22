package Classes;

public class Fraction_ClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fraction_Class f1=new Fraction_Class(20,30);
        f1.print();
	    
        f1.setnumerator(12);
        int d=f1.getdenominator();
        System.out.println(d);
        f1.print();
        
        f1.setnumerator(10);
        f1.setdenominator(30);
        f1.print();
        
        Fraction_Class f2=new Fraction_Class(3,4);
        f1.add(f2);
        f1.print();
        f2.print();
        
        Fraction_Class f3=new Fraction_Class(4,5);
        f3.multiply(f2);
        f3.print();
        f2.print();
        
        Fraction_Class f4=Fraction_Class.add(f1,f3);
        f1.print();
        f3.print();
        f4.print();
	}
}
