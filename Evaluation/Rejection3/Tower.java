import java.util.Scanner;
public class Tower{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of blocks");
		int n=scan.nextInt();
		System.out.println("Enter the blocks ");
		int arr[] = new int[n];
		int i,j;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the hieght of the towers");
		int t1=scan.nextInt();
		int t2=scan.nextInt();
		int arr1[]=arr;
		int sum=0;
		boolean b=false;
		for(i=0;i<n;i++){
			sum+=arr[i];
			if(sum==t1){
				
			}
			else if()