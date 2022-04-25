import java.util.*;

class Employee{
	int empNo,Salary;
	String empName;
	
	Employee(int no, int salary,String name){
		this.empNo = no;
		this.Salary = salary;
		this.empName = name;
	}
	
	public static void main(String args[]){
	
	System.out.println("Enter the Details   ");
	Scanner sc = new Scanner(System.in);
	
	
	
	

	System.out.print("Enter the number of employees: ");
	int Max = sc.nextInt();
	Employee[] emp = new Employee[Max]; 


	int num = sc.nextInt();
	int salary = sc.nextInt();
	String name = sc.nextLine();

	System.out.println( );		
}	
}