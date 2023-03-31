import java.util.Scanner;
public class HoloRhombus{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int s=n-i;s>=0;s--)
				System.out.print("  ");
			for(int j=1;j<=n;j++)
				if(i==1 || j==1 || i==n || j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}		
	}
}