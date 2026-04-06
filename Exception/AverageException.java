import java.util.Scanner;
class InputException extends Exception
{
    public InputException(String msg)
            {
                super(msg);
            }
}

// find avg of n nos, raise exception if -ve no:

public class AverageException
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter no: digits");
        int n=sc.nextInt();
        System.out.println("enter the digits");
        try{
            for(int i=0;i<n;i++)
            {
                int num=sc.nextInt();
                if(num<0)
                {
                    throw new InputException("Number is not positive");
                }
                sum+=num;
            }
            float avg=(float)sum/n;//type conversion of int into float for a single line
                    System.out.println("average is "+avg);
        }
        catch(InputException e)
        {
                    System.out.println(e);

        }
    }
}