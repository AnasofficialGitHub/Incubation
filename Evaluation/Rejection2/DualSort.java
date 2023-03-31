import java.util.Scanner;
public class DualSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the array");
		int i,j,temp;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){				
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		i=0;j=n-1;
		while(i<j){
			System.out.print(arr[i++]+",");
			System.out.print(arr[j--]+",");
		}
		if(n%2!=0)
			System.out.print(arr[i]);
	}
}