//array of objects
import java.util.Scanner;
class Employee{
int eno;
String ename;
double esalary;

Employee(int n,String name,double sal)
{
    eno=n;
    ename=name;
    esalary=sal;
}
}

class Empsearch
{

public static void main(String args[])
{
    Scanner s = new Scanner(System.in);
    System.out.println("enter no employees ");
    int n=s.nextInt();
    Employee e[] = new Employee[n];//e[] array of objects (class type array)

    for(int i=0;i<n;i++)
    {
        System.out.println("enter details of emp "+(i+1)+":");
        System.out.println("emp no");
       int  eno=s.nextInt();
        System.out.println("emp name");
       String   ename=s.next();
        System.out.println("emp salary");
       double  esalary=s.nextDouble();
        e[i]=new Employee(eno,ename,esalary);//1st object create and constructor invoke
    }

    System.out.print("enter the employee no to search");
    int searchno=s.nextInt();
    int flag=0;
    
    for(Employee emp:e)
    {
        if(emp.eno==searchno)
        {
            System.out.println(emp.eno);
            System.out.println(emp.ename);
            System.out.println(emp.esalary);


         flag=1;
          break;
      }

    }
    if(flag==0)
    {
        System.out.println(" employee no "+searchno+" not found");
    }

}

}