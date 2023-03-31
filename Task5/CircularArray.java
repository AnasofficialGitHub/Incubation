import java.util.Scanner;
public class CircularArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		int i;
		int arr[] = new int[n];
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			for(j=i;j<n;j++){
				