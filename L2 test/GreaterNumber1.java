import java.util.Scanner;
public class GreaterNumber1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=scan.nextInt();
		System.out.println("enter the numbers");
		int i,j,large=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
			if(large<arr[i])
				large=arr[i];
		}
		for(i=0;i<n;i++){
			int next=large;
			for(j=0;j<n;j++){
				if(i!=j && arr[i]<arr[j] && next>arr[j])
					next=arr[j];
			}
			if(arr[i]==large){
				System.out.println(arr[i]+"<");
				continue;
			}
			System.out.println(arr[i]+"<"+next);
		}
	}
}