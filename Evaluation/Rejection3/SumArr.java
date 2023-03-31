import java.util.Scanner;
public class SumArr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int i,j=0;
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i++){
			if(arr[i]==arr[i+1]){
				arr[i]+=arr[i+1];
				arr[i+1]=0;
			}
		}
		int arr1[]=new int[n];
		for(i=0;i<n;i++){
			if(arr[i]!=0){
				arr1[j]=arr[i];
				j++;
			}
		}
		for(i=0;i<n;i++)
			System.out.print(arr1[i]+" ");
					
	}
}