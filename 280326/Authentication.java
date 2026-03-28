import java.util.Scanner;
public class Authentication
{
    public static void main(String args[])
    {
        String username="Ashish";
        String password="@Ashish123";
         Scanner sc=new Scanner(System.in);
         System.out.println("enter username");
         String u1=sc.next();
        System.out.println("Enter password");
        String p1=sc.next();
      try{
          if((u1.equals(username))&&(p1.equals(password)))
          {
            System.out.println("Access granted");
          }
        else
           {
            throw new CredentialException("invalid Credentials");
           }  
         }
      catch(CredentialException e)
      {
         System.out.println(e.getMessage());        

    }
   }
}
