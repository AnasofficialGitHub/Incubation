import java.util.Scanner;
public class Oddarr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the numbers");
		int arr[] = new int[n];
		int i;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		int result=arr[0];
		for(i=1;i<n;i++){
			if(arr[i]%2!=0 && arr[i-1]%2==0)
				continue;
			else
				result=result+arr[i];
		}
		System.out.println(result);		
	}
}