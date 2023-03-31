import java.util.Scanner;
public class Suduko{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		char ch[][]= new char[9][9];
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				ch[i][j]=scan.next().charAt(0);
		check(ch);
	}
	public static void check(char ch[][]){
		if(rec(ch,0,0)){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					System.out.print(ch[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("No solution");
	}
	public static boolean rec(char ch[][],int r, int c){
		if(r==9){
			c++;
			if(c==9)
				return true;
			else 
				r=0;
		}
		if(ch[r][c]!='.')
			return rec(ch,r+1,c);
		for(int i=49;i<=57;i++){
			if(solve(ch,r,c,i)){
				ch[r][c]=(char)i;
				if(rec(ch,r+1,c))
					return true;
				ch[r][c]='.';
			}
		}
		return false;
	}
	public static boolean solve(char ch[][],int r,int c,int n){
		int i,j;
		for(i=0;i<9;i++)
			if(ch[r][i]==n)
				return false;
		for(i=0;i<9;i++)
			if(ch[i][c]==n)
				return false;
		int rr=(r/3)*3;
		int cc=(c/3)*3;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)	
				if(ch[rr+i][cc+j]==n)
					return false;

		return true;
	}
}//6384407277