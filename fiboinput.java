import java.util.Scanner;
public class fiboinput
 {

    public static void main(String args[])
 {

        int count, num1 = 0, num2 = 1;
        System.out.println("Enter the limit you want:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}