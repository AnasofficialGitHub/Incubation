import java.util.Scanner;
public class Largeoftwo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int i,j;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i+=2){
			if(arr[i]<arr[i+1])
				System.out.print(arr[i+1]+" ");
			else
				System.out.print(arr[i]+" ");
		}
	}
}