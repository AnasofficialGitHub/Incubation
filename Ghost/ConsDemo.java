package Ghost;
import java.util.Scanner;
public class ConsDemo{
	public static void main(String[] a){
		new ConsDemo();
		new ConsDemo(10);
		new ConsDemo(new Employee());
	}
	public ConsDemo(){
		System.out.println("Default Constructor");
	}
	public ConsDemo(int i){
		System.out.println("Parameter Constructor "+i);
	}
	public ConsDemo(Employee e){
		System.out.println("Employee Constructor "+e);
	}
}
class Employee{

}