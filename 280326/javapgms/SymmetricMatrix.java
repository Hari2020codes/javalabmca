import java.util.Scanner;
public class SymmetricMatrix
{
public static void main(String args[])
{  
    int row,col,i,j;
     int sy=1;
    Scanner s =new Scanner (System.in);
    System.out.println("Enter no of rows:");
    row=s.nextInt();
    System.out.println("Enter no of columns:");
    col=s.nextInt();
    if(row!=col)
    {
        System.out.println("matrix is not symmetric");
    }
      
    else{
               int mata[][]=new int [row][col];
            System.out.println("Enter the elements of Matrix:");
            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    mata[i][j]=s.nextInt();
                }
            }

            for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                   if( (mata[i][j])!=(mata[j][i]));
                   {
                    sy=0;
                    break;
                   }
                }
            }

       
           
        


    }
     if(sy==1)
        {
         System.out.println(" symmetric Matrix");
        }
        else{
                   System.out.println("not symmetric");
        }
}
}