import java.util.Scanner;
public class Addarr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=scan.nextInt();
		int arr[] = new int[n];
		int i,j;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		int sum=arr[0];
		for(i=1;i<n;i++){
			sum+=arr[i];
			for(j=0;j<=i;j++){
				if(j==i)
					System.out.print(arr[j]);
				else
					System.out.print(arr[j]+"+");	
			}
			System.out.print("="+sum);			
			System.out.println();
		}	
	}
}