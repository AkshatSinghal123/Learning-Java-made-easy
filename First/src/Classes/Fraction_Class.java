package Classes;

public class Fraction_Class {
	private int numerator;
	private int denominator;
	
	public Fraction_Class(int numerator,int denominator){
		this.numerator=numerator;
		if(denominator==0) {
			//TO DO error out
		}
		this.denominator=denominator;
		simplify();
	}

	public int getnumerator(){
		return numerator;
	}
	
    public int getdenominator() {
		return denominator;
	}
	public void setnumerator(int n) {
		this.numerator=n;
	    simplify();
	}
	public void setdenominator(int dm) {
		if(dm==0) {
			return;
		}
		this.denominator=dm;
		this.simplify();
	}
	public void print() {
		if(denominator==1) {
			System.out.println(numerator);
		}else {
		System.out.println(numerator+"/"+denominator);
	   }
    }
	private void simplify() {
		int gcd=1;
		int smaller =Math.min(numerator, denominator);
		for(int i=2;i<=smaller;i++) {
			if(denominator%i==0 && numerator%i==0) {
				        gcd=i;
				}
			}numerator=numerator/gcd;
			denominator=denominator/gcd;
	}
	public static Fraction_Class add(Fraction_Class f1,Fraction_Class f2) {
		int NewNum=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		int NewDen=f1.denominator*f2.denominator;
		Fraction_Class f=new Fraction_Class(NewNum,NewDen);
		return f;
	}
	public void add(Fraction_Class f2) {
		this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	public void multiply(Fraction_Class f2) {
		this.numerator=this.numerator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
}
