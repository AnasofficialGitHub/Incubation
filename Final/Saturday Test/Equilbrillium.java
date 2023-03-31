import java.util.Scanner;
public class Equilbrillium{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the numbers ");
		int arr[]=new int[n];
		int i,j,suml=0,sumr=0;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				sumr+=arr[j];
			}
			if(suml==sumr){
				System.out.println(i);
				return;
			}
			sumr=0;
			suml+=arr[i];
		}
		System.out.println(-1);
	}
}