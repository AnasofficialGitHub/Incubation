import java.util.Scanner;
public class DiagonalRectangle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n=scan.nextInt();
		System.out.println("Enter the numbers");
		int arr[][] = new int[n][n];
		int i,j;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				arr[i][j]=scan.nextInt();
		int sumr=0,suml=0,m=n;
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				sumr+=arr[i][j];
			}
			m--;
		}
		m=n-1;
		for(i=0;i<n;i++){
			for(j=m;j<n;j++){
				suml+=arr[i][j];
			}
			m--;
		}
		System.out.println((sumr>suml) ? sumr : suml);
	}
}