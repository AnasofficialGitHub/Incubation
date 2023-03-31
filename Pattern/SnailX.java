import java.util.Scanner;
public class SnailX{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter th M x N matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println("Enter the numbers :");
		char arr[][] =  new char[m][n];
		int i,j,count=0;
		char c;
		int rs=0,re=m-1,cs=0,ce=n-1;
		while(cs<=ce && rs<=re ){
			if(count%2==0)
				c='X';
			else
				c='0';
			for(i=rs,j=cs;j<=ce;j++)
				arr[i][j]=c;
			j--;
			for(i++;i<=re;i++)
				arr[i][j]=c;
			i--;
			if(!(rs<re && cs<ce))
				break;
			for(j--;j>=cs;j--)
				arr[i][j]=c;
			j++;
			for(i--;i>rs;i--)
				arr[i][j]=c;
			ce--;re--;rs++;cs++;count++;
		}
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}