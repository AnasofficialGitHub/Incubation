import java.util.Scanner;
public class Oddocc{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int arr[] = new int[n];
		int i,j,count,temp;
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i=j){
			count=0;
			for(j=i;j<n;j++){
				if(arr[i]==arr[j])
					count++;
				else
					break;
			}
			if(count%2!=0)
				System.out.print(arr[i]+",");
		}
	}
}