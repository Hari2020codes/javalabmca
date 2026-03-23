import java.util.Scanner;
class Employee
{
    int empid;
    String empname;
    int basic,TA,HRA,DA,tax,netsalary;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID,Name,basic,TA,HRA,DA,tax:");
        empid=sc.nextInt();
        
        empname=sc.next();
        basic=sc.nextInt();
        TA=sc.nextInt();
        DA=sc.nextInt();
        HRA=sc.nextInt();
        tax=sc.nextInt();
    }
    void calc()
    {
        netsalary=(basic+TA+DA+HRA)-tax;
    }
    void display()
    {
        
    System.out.println("Employee ID:"+empid);
    System.out.println("Employee Name:"+empname);
        System.out.println("Employee Salary:"+netsalary);
    }
    public static void main(String args[])
    {
    Employee e =new Employee();
    e.getData();
    System.out.println("Employee Details");
    System.out.println("-----------");
    e.calc();
    e.display();
}
    
}