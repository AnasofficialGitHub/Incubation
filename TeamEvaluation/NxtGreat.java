import java.util.Scanner;
public class NxtGreat{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array");
		int i,j,temp;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			temp=arr[i];
			for(j=i+1;j<n;j++){
				if(arr[i]<arr[j])
					temp=arr[j];
			}
			for(j=i+1;j<n;j++)	
				if(temp>arr[j] && arr[j]>arr[i])
					temp=arr[j];
			
			if(temp==arr[i])
				System.out.print(-1+" ");
			else 
				System.out.print(temp+" ");
		}
	}
}