import java.util.Scanner;
public class Diamond{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int s=n-i-2;s>=0;s--)
				System.out.print(" ");
			for(int j=1;j<=i+1;j++)
				if(j==1 || j==i+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
		for(int i=n-2;i>=0;i--){
			for(int s=n-i-2;s>=0;s--)
				System.out.print(" ");
			for(int j=1;j<=i+1;j++)
				if(j==1 || j==i+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}