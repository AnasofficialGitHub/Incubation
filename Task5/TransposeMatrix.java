import java.util.Scanner;
public class TransposeMatrix{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int m = scan.nextInt();
		System.out.println("Enter the column");
		int n = scan.nextInt();
		int a[][]=new int[m][n];
		int i,j,k,temp;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				for(k=n-1;k>=0;k--){
				if(k==j){
					temp=a[j][k];
					a[j][k]=a[k][j];
					a[k][j]=temp;
				}
				}
			}
		}
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}