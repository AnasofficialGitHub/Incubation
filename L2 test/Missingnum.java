import java.util.Scanner;
public class Missingnum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int m=scan.nextInt();
		System.out.println("enter the number of elements of 2nd array");
		int n=scan.nextInt();
		System.out.println("enter the numbers");
		int i,j,a,index;
		int arr[] = new int[m];
		int arr1[]= new int[n];
		for(i=0;i<m;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++)
			arr1[i]=scan.nextInt();
		if(m<n){
			a=miss(arr1,n,arr,m);
			index=m+a;
			System.out.println("array 2");
		}
		else{
			a=miss(arr,m,arr1,n);
			index=a;
			System.out.println("array 1");
		}
		System.out.println("Index : "+index);
	}
	public static int miss(int arr[],int m, int arr1[], int n){
		int i,j,flag=0;
		for(i=0;i<m;i++){
			flag=0;
			for(j=0;j<n;j++){
				if(arr[i]==arr1[j]){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(arr[i]);
				return i;
			}
		}
		return 0;
	}
}