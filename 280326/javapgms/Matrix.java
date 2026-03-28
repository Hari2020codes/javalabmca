import java.util.Scanner;
public class Matrix
{
public static void main(String args[])
{
    int row,col,i,j;
    Scanner s =new Scanner (System.in);
    System.out.println("Enter no of rows:");
    row=s.nextInt();
    System.out.println("Enter no of columns:");
    col=s.nextInt();
    int mata[][]=new int [row][col];
    System.out.println("Enter the elements of Matrix:");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            mata[i][j]=s.nextInt();
        }
    }
    System.out.println("Matrix");
    System.out.println("--------------");
    for(i=0;i<row;i++)
    {
        for(j=0;j<col;j++)
        {
            System.out.print(mata[i][j]+"\t");
        }
        System.out.println();
    }

}
}