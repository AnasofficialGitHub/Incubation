import java.util.Scanner;
public class Pant{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<i+1;j++)
				System.out.print("* ");
			for(int s=n*2-2-i*2;s>=0;s--)
				System.out.print("  ");
			for(int j=1;j<i+1;j++)
				if(j!=n)
					System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>=0;i--){
			for(int j=1;j<i+1;j++)
				System.out.print("* ");
			for(int s=n*2-2-i*2;s>=0;s--)
				System.out.print("  ");
			for(int j=1;j<i+1;j++)
				if(j!=n)
					System.out.print("* ");
			System.out.println();
		}
	}
}