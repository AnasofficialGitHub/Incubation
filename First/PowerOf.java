import java.util.Scanner;
public class PowerOf{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		System.out.println("Enter the power number");
		int p = scan.nextInt();
		int temp = a;
		for(int i=1;i<p;i++){
			a*=temp;
		}
		System.out.println(a);
	}
}
			