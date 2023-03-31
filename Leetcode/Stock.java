import java.util.Scanner;
public class Stock{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of days");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the price of stock each day");
		int i,profit=0;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the number of transaction : ");
		int k=scan.nextInt();
		for(i=0;i<n-1;i++){
			if(arr[i]<arr[i+1]){
				profit+=arr[i+1]-arr[i];
				k--;
				i++;
			}
			if(k==0)
				break;
		}
		System.out.println("Profit : "+profit);
	}
}