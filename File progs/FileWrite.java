import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 import java.io.*;
import java.util.Scanner;

public class FileWrite 
{
    public static void main(String args[])
    {
        try{
            Scanner s=new Scanner(System.in);
            System.out.println("\nEnter file name");
            String fname=s.next();
          FileWriter obw=new FileWriter(fname,true);///////////////appends to already existing file
            System.out.println("enter number of entries");
            int n=s.nextInt();
          System.out.println("\n enter the data");
          String data;
          for(int i=0;i<n;i++)
          {
            data=s.next();
            obw.write(data+"\n");
         }
         obw.close();

         FileReader obr=new FileReader(fname);
         BufferedReader br=new BufferedReader(obr);
        System.out.println("\n----------------------------");

        System.out.println("file name: "+fname);
      System.out.println("data:-- ");
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
         obr.close();
        }
       catch(IOException e)
       {
            System.out.println("error");

       } 
    }
}