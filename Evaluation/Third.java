import java.util.Scanner;
public class Third{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,j,temp;
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the number");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-2;i++){
			for(j=0;j<n-i-1;j++){
				if(i%2==0){
					if(arr[i]>arr[i+2]){
						temp=arr[i];
						arr[i]=arr[i+2];
						arr[i+2]=temp;
					}
				}
				else{
					if(arr[i]<arr[i+2]){
						temp=arr[i];
						arr[i]=arr[i+2];
						arr[i+2]=temp;
					}
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}
			