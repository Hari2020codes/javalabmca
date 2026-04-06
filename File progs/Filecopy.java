import java.io.FileInputStream;
// to read and write files
import java.io.FileOutputStream;
import java.io.IOException;
public class Filecopy
{
    public static void main(String args[])
    {
        try{
            FileInputStream fi=new FileInputStream("BCA.txt");
            FileOutputStream fo=new FileOutputStream("MCA.txt");
            int i;
            while((i=fi.read())!=-1)
               {
                fo.write(i);
               }
             System.out.println("successfully copied");
             fi.close();
             fo.close();   

          }
       catch(IOException e)
          {
             System.out.println("error "+e.getMessage());
          }
    }
}