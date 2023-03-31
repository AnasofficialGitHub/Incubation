import java.util.Scanner;
public class GreaterNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=scan.nextInt();
		System.out.println("enter the numbers");
		int i,j,k,large=0;
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++)
			if(large<arr[i])
				large=arr[i];
	
		
		for(i=0;i<n;i++){
			int flag=0;
			if(arr[i]==large){
				System.out.print(arr[i]+"> ");
				continue;
			}
			for(j=1;j<=large;j++){
				for(k=0;k<n;k++){
					if(arr[k]==arr[i]+j){
						System.out.print(arr[i]+">"+arr[k]+" "); 
						flag=1;
						break;
					}
				}
				if(flag==1)
					break;
			}
		}

	}
}