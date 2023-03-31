import java.util.Scanner;
public class Riyaztask{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=scan.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the name");
			String name=scan.next();
			System.out.println("Enter the rollno");
			int rollno=scan.nextInt();
			System.out.println("Enter the address");
			String address=scan.next();
			System.out.println("Enter the phno");
			long phno=scan.nextLong();
			s[i]=new Student(name,rollno,phno,address);
		}
		
	}
}
class Student{
	String name;
	int rollno;
	String address;
	long phno;
	public Student(String name,int rollno,long phno, String address){
		this.name=name;
		this.rollno=rollno;
		this.address=address;
		this.phno=phno;
		System.out.println(this.name+" "+this.rollno+" "+this.phno+" "+this.address);
	}
	
}