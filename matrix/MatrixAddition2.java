import java.util.Scanner;
class MatrixAdd
{
    Scanner s=new Scanner(System.in);
    int r, c;
    int[][] mat1,mat2,res;//declare 3 integer arrays
    MatrixAdd(int r1, int c1)
    {   r=r1;
        c=c1;
    }

    void getData()
    {
         mat1=new int[r][c];
         mat2=new int[r][c];
         res=new int[r][c];   // initialize 3 arrays
         
         System.out.println("Enter elements of 1st array");
         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                mat1[i][j]=s.nextInt();
            }
         }

         System.out.println("Enter elements of 2nd array");
         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                mat2[i][j]=s.nextInt();
            }
         }    
    }

   void addMatrix()
   {
  
         for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
         }   
   } 

  void display()
  {
    System.out.println(" resultant matrix");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            System.out.print(res[i][j]+"  ");
        }
        System.out.println();
    }
  }
}

  class MatrixAddition2
  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("Enter no: rows and cols of 1st matrix");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter no: rows and cols of 2nd matrix");
        r2=sc.nextInt();
        c2=sc.nextInt();
        if(r1==r1 && c1==c2)
        {
            MatrixAdd obj=new MatrixAdd(r1,c1);
            obj.getData();
            obj.addMatrix();
            obj.display();
        }
        else
        {
            System.out.println("Matrix addition not possible");
        }
    }
  }


