import java.util.Scanner;
public class InsertionSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		for(int i=1;i<arr.length;i++){
			int temp=arr[i],j=i;
			while(j>0 && temp<arr[j-1]){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;	
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
