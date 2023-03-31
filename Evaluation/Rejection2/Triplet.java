import java.util.Scanner;
public class Triplet{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the array");
		int i,j,temp,mul=1;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){				
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=n-1,j=1;i>=0 && j<=3;i--,j++)
			mul=mul*arr[i];
		System.out.println(mul);
		for(i=n-1,j=1;i>=0 && j<=3;i--,j++)
			System.out.print(arr[i]+",");
	}
}
