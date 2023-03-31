import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(fact(arr[i])<=fact(arr[j])){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	static int fact(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;
		}
		return count;
	}
}