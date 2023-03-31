import java.util.Scanner;
public class Sortcount{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();	
		System.out.println("Enter the number");
		int i,j,k,temp,count=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i++){
			k=i;
			for(j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					k=j;
				}
			}
			if(i<k){
				temp=arr[k];
				arr[k]=arr[i];
				arr[i]=temp;
				count++;
			}
		}
		System.out.println(count);
	}
}
		