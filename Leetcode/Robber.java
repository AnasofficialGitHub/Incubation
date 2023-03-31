import java.util.Scanner;
public class Robber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of house");
		int n=scan.nextInt();
		int arr[] = new int[n];
		int i,money=0;
		System.out.println("Enter the amount in each house");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;){
			if(arr[i]<arr[i+1]){
				money+=arr[i+1];
				i+=3;
			}
			else{
				money+=arr[i];
				i+=2;
			}
		}
		System.out.println("The number of money robbed : "+money);

	}
}
