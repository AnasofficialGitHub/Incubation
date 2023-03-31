import java.util.Scanner;
public class QuickSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		
		quick(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void quick(int[] arr,int low,int high){
		if(low<high){
			int pivot=sort(arr,low,high);
			quick(arr,low,pivot-1);
			quick(arr,pivot+1,high);
		}

	}
	public static int sort(int[] arr,int low,int high){
		int pivot=high;
		int i=low-1;
		for(int j=low;j<=high;j++){
			if(arr[j]<=arr[pivot]){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return i;
	}
}