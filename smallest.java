import java.util.Scanner;
public class smallest
{
public static void main(String args[])
{
   Scanner in=new Scanner(System.in);
   System.out.println("Enter the first number:");
   int x=in.nextInt();
   System.out.println("Enter the second number:");
   int y=in.nextInt();
   System.out.println("enter the third number:");
   int z=in.nextInt();
   System.out.println("The smallest value is" + smallest(x,y,z)+"\n");
}
public static int smallest(int x,int y,int z)
{
    return Math.min(Math.min(x,y),z);
}
}