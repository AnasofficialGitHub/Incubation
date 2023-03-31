import java.util.Scanner;
public class RotateArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();	
		System.out.println("ENter the numbers");
		int i;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		int temp=arr[n-1];
		for(i=n-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0]=temp;
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}