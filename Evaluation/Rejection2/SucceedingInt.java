import java.util.Scanner;
public class SucceedingInt{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the array");
		int i,j,temp,r;
		int num=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++)
			num=num*10+arr[i]*10;
		num=num/10;
		num=num+1;
		
		System.out.print(num);
	}
}