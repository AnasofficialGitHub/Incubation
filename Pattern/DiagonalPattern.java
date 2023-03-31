import java.util.Scanner;
public class DiagonalPattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();	
		int n=scan.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=scan.nextInt();
		int i=0,j=0;
		boolean b=true;
		System.out.print(arr[i][j]+" ");
		while(i<=m && j<=n){
			if(i==0 && j==0 || i==m-1 || i==0 && j!=n-1)
				j++;
			else 
				i++;
			if(b){
				for(;i<m && j>=0;i++,j--)
					System.out.print(arr[i][j]+" ");
				i--;j++;
				b=false;
			}
			else{
				for(;i>=0 && j<n;i--,j++)
					System.out.print(arr[i][j]+" ");
				i++;j--;
				b=true;
			}
			if(i==m-1 && j==n-1)
				break;
		}
	}
}