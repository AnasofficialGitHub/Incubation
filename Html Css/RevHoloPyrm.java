import java.util.Scanner;
public class RevHoloPyrm{
	public static void main(String[] args){
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.println("* ");
			}		
			System.out.println();
		}
	}
}