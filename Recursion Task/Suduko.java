import java.util.Scanner;
public class Suduko{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char table[][]=new char[9][9];
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				table[i][j]=scan.next().charAt(0);
		result(table);
		
	}
	public static void result(char arr[][]){
		if(solve(arr,0,0)){
			System.out.println("Solution");
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("Not possible");
	}
	public static boolean solve(char arr[][], int r, int c){
		if(r==9){
			c++;
			if(c==9)
				return true;
			else
				r=0;
		}
		if(arr[r][c]!='.')
			return solve(arr,r+1,c);
		for(int num=49;num<=57;num++){
			if(check(arr,num,r,c)){
				arr[r][c]=(char)num;
				if(solve(arr,r+1,c))
					return true;
				arr[r][c]='.';
			}
		}
		return false;
	}
	public static boolean check(char arr[][],int num,int r,int c){
		int i,j;
		for(i=0;i<9;i++)
			if(arr[i][c]==num)
				return false;
		for(i=0;i<9;i++)
			if(arr[r][i]==num)
				return false;
		int row=(r/3)*3;
		int col=(c/3)*3;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				if(arr[row+i][col+j]==num)
					return false;
		return true;		
	}
}