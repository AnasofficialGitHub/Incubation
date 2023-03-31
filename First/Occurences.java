import java.util.Scanner;
public class Occurences{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count=0,n,i,a;
		System.out.println("Enter the number of elements ");
		n=scan.nextInt();
		System.out.println("Enter the number : ");
		int[] arr = new int[n];
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
			
		}
		for(i=0;i<n;i++){
			
				if(i==0)
					a=arr[i];
				else if(
			