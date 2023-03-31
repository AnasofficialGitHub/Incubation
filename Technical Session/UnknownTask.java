import java.util.Scanner;
public class UnknownTask{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=scan.nextInt();
		Employee obj[]=new Employee[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the name");
			String name=scan.next();
			System.out.println("Enter the rollno");
			int years=scan.nextInt();
			System.out.println("Enter the address");
			String address=scan.next();
			System.out.println("Enter the phno");
			int Salary=scan.nextInt();
			obj[i]=new Employee(name,years,Salary,address);
		}
		
	}	
}
class Employee{
	String name;
	int years;
	int Salary;
	String address;
	public Employee(String name, int years,int Salary,String address){
		this.name=name;
		this.years=years;
		this.Salary=Salary;
		this.address=address;
	}
	public void print(){
		System.out.println(name+" "+years+" "+Salary+" "+address);
	}
}