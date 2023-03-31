import java.util.Scanner;
public class First{
	public static void main(String[] args){
		int arr[] = new int[50];
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements");
		int n = scan.nextInt();
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			