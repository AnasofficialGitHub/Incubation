import java.util.Scanner;
public class Nqueens{
	static int count=0;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		char[][] ch = new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				ch[i][j]='.';
		rec(ch,n,0,0);
		if(count==0)
			System.out.println("No solution");
		else
			System.out.println(count);
	}
	
	public static boolean rec(char ch[][],int n,int r , int c){
		if(c==n){
			print(ch,n);
			if(r==n)
				return true;
			else
				c=0;
		}
		else if(r==n)
			return false;
		if(solve(ch,r,c,n)){
			ch[r][c]='Q';
			if(rec(ch,n,0,c+1))
				return true;
			ch[r][c]='.';
		}
		return rec(ch,n,r+1,c);
	}
	public static boolean solve(char ch[][],int r,int c,int n){
		for(int i=0;i<n;i++)
			if(ch[i][c]=='Q')
				return false;
		for(int i=0;i<n;i++)
			if(ch[r][i]=='Q')
				return false;
		
		for(int i=r,j=c;i>=0 && j>=0;i--,j--)
			if(ch[i][j]=='Q')
				return false;
		for(int i=r,j=c;i<n && j>=0;i++,j--)
			if(ch[i][j]=='Q')
				return false;
		return true;
	}
	public static void print(char ch[][],int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(ch[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		count++;
	}
}