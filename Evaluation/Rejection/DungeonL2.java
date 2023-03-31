import java.util.Scanner;
public class DungeonL2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int m=scan.nextInt();
		System.out.println("Enter the column");
		int n=scan.nextInt();
		int arr[][] = new int[m][n];
		System.out.println("Enter the path");
		int i,j,k,count=0;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				arr[i][j]=scan.nextInt();
		for(i=0,j=0;i<m && j<n;){
				int flag=0;
				if(arr[i][j]==1){
					arr[i][j]=0;
					count++;
				}
				for(k=j+1;k<n;k++){
					if(arr[i][k]==1){
						flag=1;
						break;
					}
					else if(arr[i][k]==-1){
						flag=2;
						break;
					}
				}
				if(flag==0 || flag==2)
					i++;
				else if(i==m-1)
					j++;
				else if(j==n-1)
					i++;
				else if(arr[i][j+1]==-1)
					i++;
				else if(arr[i+1][j]==-1)
					j++;
				else if(i==m-1 && j==n-1)
					break;
				else 
					j++;
			
		}
		for(i=m-1,j=n-1;i>=0 && j>=0;){
				int flag=0;
				if(arr[i][j]==1){
					count++;
				}
				for(k=j-1;k>=0;k--){
					if(arr[i][k]==1){
						flag=1;
						break;
					}
					else if(arr[i][k]==-1){
						flag=2;
						break;
					}
				}
				if(flag==0 || flag==2)
					i--;
				else if(i==0)
					j--;
				else if(j==0)
					i--;
				else if(arr[i][j-1]==-1)
					i--;
				else if(arr[i-1][j]==-1)
					j--;
				else if(i==0 && j==0)
					break;
				else 
					j--;
			
		}
		
		System.out.println(count);
	}
}