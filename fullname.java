import java.util.*;
class fullname
{
  public static void main(String args[])
   {
     Scanner frst=new Scanner(System.in);
     System.out.println("Enter your first name");
     String fname=frst.next();
     Scanner lst=new Scanner(System.in);
     System.out.println("Enter your last name");
     String lname=lst.next();
     System.out.println(fname+" "+lname);
   }
}