import java.util.Scanner;
public class MergeSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the number of elements :");
		//int n=scan.nextInt();
		int[] arr = new int[scan.nextInt()];
		int i;
		for(i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		
		merge(arr,0,arr.length-1);

		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	static void merge(int[] arr, int low, int high){
		if(low>=high){
			return;
		}

		int middle=(low+high)/2;
		
		merge(arr,low,middle);
		merge(arr,middle+1,high);

		sort(arr,low,middle,high);
	}
	static void sort(int[] arr,int low,int middle,int high){
		int temp[]=new int[arr.length];
		for(int i=0;i<=high;i++)
			temp[i]=arr[i];
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle && j<=high){
			if(temp[i]<temp[j]){
				arr[k]=temp[i];
				i++;
			}
			else{
				arr[k]=temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			arr[k]=temp[i];
			i++;k++;
		}
		while(j<=high){
			arr[k]=temp[j];
			j++;k++;
		}
		
	}
}