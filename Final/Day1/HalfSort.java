import java.util.Scanner;
public class HalfSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=scan.nextInt();
		System.out.println("Enter the numbers ");
		int i,j;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=n/2;i<n;i++){
			for(j=n/2;j<n-1;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}