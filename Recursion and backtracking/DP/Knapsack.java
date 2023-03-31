import java.util.Scanner;
public class Knapsack{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int w[] = new int[n];
		int v[] = new int[n];
		for(int i=0;i<n;i++)
			w[i]=scan.nextInt();
		for(int i=0;i<n;i++)
			v[i]=scan.nextInt();
		int c=scan.nextInt();
		solve(w,v,n,c);
	}
	public static void solve(int w[],int v[],int n,int c){
		int arr[][]=new int[n+1][c+1];
		int nt,tn;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=c;j++){
				nt=arr[i-1][j];
				tn=0;
				if(w[i-1]<=j)
					tn=v[i-1]+arr[i-1][j-w[i-1]];
				if(tn<=nt)
					arr[i][j]=nt;
				else
					arr[i][j]=tn;
			}
		}
		print(w,arr,n,c);
	}
	public static void print(int w[],int arr[][],int n,int c){
		System.out.println(arr[n][c]+" ");
		for(int i=n,j=c;i>0;i--){
			if(arr[i][j]!=0 && arr[i][j]!=arr[i-1][j]){
				System.out.println(w[i-1]);
				j=j-w[i-1];
			}
		}
	}
}