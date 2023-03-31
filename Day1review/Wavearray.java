import java.util.Scanner;
public class Wavearray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int arr[] = new int[n];
		int i,temp;
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i=i+2){
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}