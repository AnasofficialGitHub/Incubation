import java.util.Scanner;
public class Median{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements ");
		int n=scan.nextInt();
		System.out.println("Enter number of elements in 2nd array");
		int m=scan.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];
		int i,j;
		System.out.println("Enter the 1st array");
		for(i=0;i<n;i++)
			arr1[i]=scan.nextInt();
		System.out.println("Enter the 2nd array");
		for(i=0;i<m;i++)
			arr2[i]=scan.nextInt();
//		if(m==n)
//			System.out.println((arr1[n-1]+arr2[m-1])/2);
//		else if((m+n)%2!=0){
//			if(m>n){
//				j=(m-n)/2;
//				System.out.println(arr2[j]);
//			}
//			else{
//				j=(n-m)/2;
//				System.out.println(arr1[j]);
//			}
//		}
//		else{
//			if(m>n){
//				j=(m-n)/2;
//				System.out.println((arr2[j]+arr2[j-1])/2);
//			}
//			else{
//				j=(n-m)/2;
//				System.out.println((arr1[j]+arr1[j-1])/2);
//			}
//		}	
	}
}