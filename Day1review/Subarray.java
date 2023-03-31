import java.util.Scanner;
public class Subarray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scan.nextInt();
		System.out.println("enter the elements");
		int i,j,result=0,count=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			result=0;
			for(j=i;j<n;j++){
				result=result+arr[j];
				if(result==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}