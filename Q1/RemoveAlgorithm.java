import java.util.Scanner;
public class RemoveAlgorithm{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		int arr[] = new int[n];
		int i,j,count=0,counter=0;
		for(i=0,j=1;i<n;i++,j++)
			arr[i]=j;
		int m=n;
		for(i=0;i<m/2;i++){
			if(n==1){
				System.out.println(arr[0]);
				break;
			}
			counter=0;
			for(j=0;j<n;j=j+2){
				arr[j]=0;
				counter++;
			}
			swap(arr,m);
			n=n-counter;
			if(n==1){
				System.out.println(arr[0]);
				break;
			}
			counter=0;
			for(j=n-1;j>=0;j=j-2){
				arr[j]=0;
				counter++;
			}
			swap(arr,m);
			n=n-counter;
		
		}
	}
	public static void swap(int arr[],int n){
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				for(int j=i;j<n-1;j++)
					arr[j]=arr[j+1];
			}
			arr[n-1]=0;
		}
	}
}