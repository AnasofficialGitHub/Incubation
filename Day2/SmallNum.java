import java.util.Scanner;
public class SmallNum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number : ");
		int a = scan.nextInt();
		System.out.println("Enter the second Number : ");
		int b = scan.nextInt();
		System.out.println("Enter the third Number : ");
		int c = scan.nextInt();
		float result = small(a,b,c);
		System.out.println("The smallest value is "+result);
	
	}
	public static int small(int x, int y, int z){
		if(x<=y){
			if(x<=z)
				return x;
			else
				return z;
		}
		else{
			if(y<=z)
				return y;
			else
				return z;
		}
				


	}
}