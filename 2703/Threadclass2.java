
import java.util.Scanner;
class Multiplication extends Thread
{
    @Override
    public void run()
    {
            System.out.println("Multiplication table of 5");
            for(int i=0;i<=10;i++)
            {
                        System.out.println(i+" X 5 = "+i*5);                        
            }
                    System.out.println("exiting thread multiplication");

    }
}

class Primes extends Thread
{
    @Override
    public void run()
    {         
    }
}

public class Threadclass2
{
    public static void main(String args[])
    {
        Multiplication m1=new Multiplication();
        m1.start();
         EvenNos e1=new  EvenNos();
        e1.start(); 
    }
}