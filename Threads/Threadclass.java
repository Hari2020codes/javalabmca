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

class EvenNos extends Thread
{
    @Override
    public void run()
    {                System.out.println("------------------------ ");
                    System.out.println("even nos ");


        Scanner sc=new Scanner(System.in);
                System.out.println("enter limit ");
                int num=sc.nextInt();

            for(int i=0; i<num; i++)
            {
              if(i%2==0)
              {
                        System.out.println(i);
              }   
            }

    }
}

public class Threadclass
{
    public static void main(String args[])
    {
        Multiplication m1=new Multiplication();
        m1.start();
         EvenNos e1=new  EvenNos();
        e1.start(); 
    }
}