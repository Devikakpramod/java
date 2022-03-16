import java.io.*;
import java.util.*;
class sumtwo
{ 
   public static void main(String args[])
     { 
       Scanner firstInt=new Scanner(System.in);
       System.out.println("Enter frst num:");
       int first=firstInt.nextInt();
       Scanner secondInt=new Scanner(System.in);
       System.out.println("Enter scnd num:");
       int second=secondInt.nextInt();
       int sum=first+second;
       System.out.println("The sum is "+ sum);
     }
}