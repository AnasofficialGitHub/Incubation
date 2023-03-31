import java.util.Scanner;
public class Pair{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the array");
		int i,j,count=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the number");
		int r=scan.nextInt();
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){				
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					swap(arr,j,n);
					n--;
				}
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i!=j && arr[i]+arr[j]==r){
					System.out.println(arr[i]+","arr[j]+" ");
				}
			}
		}

	}
	public static void swap(int arr[],int j,int n){
		int k;
		for(k=j;k<n-1;k++){
			arr[k]=arr[k+1];
		}
		arr[n-1]=0;
	}
}