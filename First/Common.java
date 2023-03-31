import java.util.Scanner;
public class Common{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int m=scan.nextInt();
		int arr[]=new int[m];
		System.out.println("Enter the numbers ");
		for(int i=0;i<m;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the number of elements in second array");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
			arr1[i]=scan.nextInt();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(arr[i]==arr1[j])
					System.out.print(arr[i]+" ");
			}
		}
	}
}