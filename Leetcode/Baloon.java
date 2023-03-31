import java.util.Scanner;
public class Baloon{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of baloons");
		int n=scan.nextInt();
		int i,j,k,coins=0;
		int arr[]=new int[n];
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=1;i<n-1;i++){
			int a=1,b=1;
			for(j=i-1;j>=0;j--){
				if(arr[j]!=0){
					a=arr[j];
					break;
				}
			}
			for(k=i+1;k<n;k++){
				if(arr[k]!=0){
					b=arr[k];
					break;
				}
			}
			coins+=arr[i]*a*b;
			arr[i]=0;
		}
		if(arr[0]<arr[n-1]){
			coins+=arr[0]*arr[n-1];
			coins+=arr[n-1];
		}
		else{
			coins+=arr[0]*arr[n-1];
			coins+=arr[0];
		}
		System.out.println(coins);
	}
}