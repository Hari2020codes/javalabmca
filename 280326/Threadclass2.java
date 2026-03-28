
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
          Scanner sc=new Scanner(System.in);
        System.out.println("----------------------------- ");
         System.out.println("prime numbers ");
          System.out.println("Enter value of n ");
          int n=sc.nextInt();
          prime_n(n) ;
          sc.close();
    }
static void prime_n(int n)
{
    int x,y,flag;
    System.out.println("all the prime nos within 1  and "+n+" are");
    for(x=2;x<=n;x++)
    {
        flag=1;
        for(y=2;y<=x/2;y++)
          {
            if(x%y==0)
            {
                flag=0;
                break;
            }            
          }
          if(flag==1)
          {
        System.out.println(x+"\t");      
         }
    }
}                  
}

public class Threadclass2
{
    public static void main(String args[])
    {
        Multiplication m1=new Multiplication();
        m1.start();
         Primes p1=new Primes();
        p1.start(); 
    }
}