import java.util.Scanner;
public class NoDuplicate{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the elements");
		int i,j,flag=0;
		int arr[]=new int[n];
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			flag=0;
			for(j=0;j<n;j++){
				if(i!=j && arr[i]==arr[j]){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}