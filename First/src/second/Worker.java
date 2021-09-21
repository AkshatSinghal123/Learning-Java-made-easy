package second;
import java.util.Scanner;
 
abstract class Worker
{
    String name;
    float rate;
    Worker(String n,float r)
    {
        name = n;
        rate = r;
    }
     
    abstract float comPay();
}
 
class DailyWorker extends Worker
{
    private int hours;
    DailyWorker(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float comPay()
    {
        int days=hours/24;
        return rate*days;
    }
}
 
class SalariedWorker extends Worker
{
    private int hours;
    SalariedWorker(String n,float r,int h)
    {
        super(n,r);
        hours = h;
    }
    public float comPay()
    {
        int weeks=hours/(24*7);
        return rate*weeks;
    }
}
 
class Work
{
    public static void main(String args[])
    {
        String name;
        float rate;
        int time;
         
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter Daily Worker name: ");
        name = in.nextLine();
        System.out.print("Enter rate per day: ");
        rate = in.nextFloat();
        System.out.print("Enter number of hours: ");
        time = in.nextInt();
        DailyWorker dw = new DailyWorker(name,rate,time);
        System.out.println("Salary: "+dw.comPay()+"\n\n");
         
 
        in.nextLine();
        System.out.print("Enter Salaried Worker name: ");
        name = in.nextLine();
        System.out.print("Enter rate per week: ");
        rate = in.nextFloat();
        System.out.print("Enter number of hours: ");
        time = in.nextInt();
        SalariedWorker sw = new SalariedWorker(name,rate,time);
        System.out.println("Salary: "+sw.comPay());
    }
}