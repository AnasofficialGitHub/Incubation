import java.util.Scanner;
public class SplitArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int i,j,m;
		if(n%2==0)
			m=n/2;
		else
			m=n/2+1;
		int arr[]=new int[n];
		int arr1[]=new int[n/2];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=m,j=0;i<n && j<m;i++,j++){
			arr1[j]=arr[i];
			arr[i]=0;
		}
		for(i=0;i<m;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		for(i=0;i<n/2;i++)
			System.out.print(arr1[i]+" ");	
	}
}