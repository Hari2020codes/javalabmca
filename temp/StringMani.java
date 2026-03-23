import java.util.Scanner;
public class StringMani
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println(" enter the string");
      String str1=sc.next();
      System.out.println(" length of string "+ str1.length());
      System.out.println(" character at 2nd possition "+ str1.charAt(1));
      System.out.println("string contains 'ple' sequence "+ str1.contains("ple"));
      System.out.println("string end with e "+ str1.endsWith("e"));
      System.out.println("Replace 'pp' with 'nk' "+ str1.replaceAll("pp","nk"));
      System.out.println(" lower case "+ str1.toLowerCase());
      System.out.println(" upper case "+ str1.toUpperCase());
      System.out.println(" Index of e "+ str1.indexOf('e'));
      System.out.println("Substring from index 2 "+ str1.substring(2));
      System.out.println(" enter 2nd string ");
      String str2=sc.next();
      System.out.println("string1 concatenated with string 2 "+ str1.concat(str2));





    }
}