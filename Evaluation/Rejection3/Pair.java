import java.util.Scanner;
public class Pair{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int i,j,count=0;
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();	
		System.out.println("Enter the sum ");
		int sum=scan.nextInt();
		for(i=0;i<n;i++){
			for(j=i;j<n;j++){
				if(arr[i]+arr[j]==sum){
					System.out.println(arr[i]+","+arr[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}