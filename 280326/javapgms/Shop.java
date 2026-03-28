import java.util.Scanner;
interface Calc
{
    void calculate();
}

class Bill implements Calc
{    int quantity;
    String pid, pname;
    double price,total, amount=0;
    Scanner s=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("enter product details");
        System.out.println("_______________________");

        System.out.println("enter product id");
         pid=s.next();
        System.out.println("enter product name");
         pname=s.next();
        System.out.println("enter product quantity");
          quantity=s.nextInt();
        System.out.println("enter product price");
          price=s.nextDouble();
    }
    public void calculate()//implemented method
    {   total=quantity*price;//cost of each prduct with different quantity
    }

    public void display()
    {
        System.out.println("\t"+pname+"\t"+quantity+"\t\t"+price+"\t"+total);
    }

}
 class Shop
 {
    public static void main(String args[])
    {
        int n,i,orderno;
        double namount=0;//total cost of all products
        String date;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter bill details");
        System.out.println("--------------------");
       System.out.println("order no");
       orderno=sc.nextInt();
       System.out.println("date");
        date=sc.next();
      System.out.println("No : products");
         n=sc.nextInt();
         Bill ob[]=new Bill[n];

        //  for(i=0;i<n;i++) 
        //  { ob[i]=new Bill();}// create n number of objects

            for(i=0;i<n;i++)
            {   
                ob[i]=new Bill();
                ob[i].getdata();
                ob[i].calculate();
            }
       System.out.println("orderno :"+orderno);
        System.out.println("date :"+date);
    System.out.println("Product Name    Quantity    Unit price  Total" );
            System.out.println("------------------------------------------");
            for(i=0;i<n;i++)
             {
                ob[i].display();
                namount+=ob[i].total;
             }
               System.out.println(" ");
             System.out.println("\t\t Net amount "+namount);
        
    }

 }
