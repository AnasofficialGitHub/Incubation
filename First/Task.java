import java.util.Scanner;
public class Task{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a NUmber");
		double a = scan.nextDouble();
		if(a==0){
			System.out.println("zero");
			if(a<1){
				System.out.println("Small");
			}
			else if(a>1000000){
				System.out.println("Large");
			}
		}
		else if(a<0){
			System.out.println("Negative");
			if(a<1){
				System.out.println("Small");
			}
			else if(a>1000000){
				System.out.println("Large");
			}
		}
		else if(a>0){
			System.out.println("Postive");
			if(a<1){
				System.out.println("Small");
			}
			else if(a>1000000){
				System.out.println("Large");
			}
		} 
	}
}