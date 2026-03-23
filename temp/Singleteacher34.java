import java.util.Scanner;
class Employee
{
    int empid;
    String ename, address;
    Double salary;
    Employee(int no, String na,  String address, double sal)
    {
        empid=no;
        this.address=address;  
        ename=na;
        salary=sal;

    }
}
class Teacher extends Employee
{
    String dept,subject;
    Teacher(int no, String na, String address, double sal, String dep, String sub)
    {
        super(no,na,address, sal);
        dept=dep;
        subject=sub;
    } 
    void display()
    {
        System.out.println("empid : "+empid);
        System.out.println("name : "+ename);
        System.out.println("address : "+address);
        System.out.println("salary : "+salary);
        System.out.println("department : "+dept);
        System.out.println("subject : "+subject);
    }
}
class Singleteacher34 
{
    public static void main(String args[])
 {
     Scanner s = new Scanner(System.in);
     System.out.println("enter no : employees");
     int num = s.nextInt();
     Teacher arr[]=new Teacher[num];
     for(int i=0;i<num;i++)
     {
     System.out.println("enter employee "+(i+1)+" details id,name,address,salary,department,subject");
      int empid=s.nextInt();
      String name=s.next();
      String address=s.next();
      double salary=s.nextDouble();
      String department=s.next();
      String subject=s.next();
      arr[i]=new Teacher(empid, name, address, salary, department,subject);     
     }
    System.out.println("information of employees");
    for(int i=0;i<num;i++)
    {
        System.out.println("employee : "+(i+1)+" details");
     System.out.println("----------------------------------");
     arr[i].display();

    }
    s.close();

 }
}