import java.util.Scanner;
public class Pyramid{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int s=n-1-i;s>=0;s--)
				System.out.print("  ");	
			for(int j=0;j<=i*2;j++)
				if(i==0 || j==0 || j==i*2 )
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
		for(int i=n-2;i>=0;i--){
			for(int s=0;s<n-i;s++)
				System.out.print("  ");	
			for(int j=0;j<=i*2;j++)
				if(j==i*2 || i==0 || j==0)
					System.out.print("* ");
				
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}