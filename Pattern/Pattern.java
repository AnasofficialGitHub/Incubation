import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();	
		int i,j;
		for(i=0;i<n;i++){
			int temp=n-i;
			for(j=0;j<n;j++){
				if(i<=j)
					System.out.print(temp+" ");
				else
					System.out.print(n-j+" ");
			}
			System.out.println();
			
		}
		
	}
}