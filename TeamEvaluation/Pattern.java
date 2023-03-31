import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		int arr[][]=new int[n][n];	
		int i,j,k,m=n;
		for(i=0;i<n;i++){
			int temp=n-i;
			for(j=0,k=n-1;j<n;j++,k--){
				if(i<=j)
					System.out.print(temp+" ");
				else if()
					System.out.print(temp+k+" ");
			}
			System.out.println();
			
		}
		
	}
}