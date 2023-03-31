import java.util.Scanner;
public class Snail{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter th M x N matrix");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println("Enter the numbers :");
		int arr[][] =  new int[m][n];
		int i,j;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				arr[i][j]=scan.nextInt();
		System.out.println(arr.length+" "+arr[0].length);
		int rs=0,re=m-1,cs=0,ce=n-1;
		while(cs<=ce && rs<=re ){
			for(i=rs,j=cs;j<=ce;j++)
				System.out.print(arr[i][j]+",");
			j--;
			for(i++;i<=re;i++)
				System.out.print(arr[i][j]+",");
			i--;
			if(!(rs<re && cs<ce))
				break;
			for(j--;j>=cs;j--)
				System.out.print(arr[i][j]+",");
			j++;
			for(i--;i>rs;i--)
				System.out.print(arr[i][j]+",");
			ce--;re--;rs++;cs++;
		}
	}
}