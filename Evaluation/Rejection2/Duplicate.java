import java.util.Scanner;
public class Duplicate{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the array");
		int i,j,count=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					
					swap(arr,j,n);
				
				}
			}
		}
		for(i=0;i<n;i++){
			if(arr[i]!=-1000)
				System.out.print(arr[i]+",");
			else
				System.out.print("_,");
		}
		

	}
	public static void swap(int arr[],int j,int n){
		int k;
		for(k=j;k<n-1;k++){
			arr[k]=arr[k+1];
		}
		arr[n-1]=-1000;
	}	

}