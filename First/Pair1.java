import java.util.Scanner;
public class Pair1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		int target=scan.nextInt();
		for(int i=0,j=n-1,k=n/2,l=n/2;i<j;i++,j--,k--,l++){
			if(arr[i]+arr[j]==target && i!=j){	
				System.out.println(arr[i]+" "+arr[j]);
				break;
			}
			else if(arr[i]+arr[i+1]==target && (i+1)!=j && i!=j){
				System.out.println(arr[i]+" "+arr[i+1]);
				break;
			}
			else if(arr[j]+arr[j-1]==target && (j-1)!=j && j!=i){
				System.out.println(arr[j]+" "+arr[j-1]);
				break;
			}
			else if(arr[i]+arr[k]==target && k!=i){
				System.out.println(arr[j]+" "+arr[j-1]);
				break;
			}
			else if(arr[j]+arr[k]==target && k!=j){
				System.out.println(arr[j]+" "+arr[j-1]);
				break;
			}
			else if(arr[i]+arr[l]==target && l!=i){
				System.out.println(arr[j]+" "+arr[j-1]);
				break;
			}
			else if(arr[j]+arr[l]==target && l!=j){
				System.out.println(arr[j]+" "+arr[j-1]);
				break;
			}
			else if(arr[k]+arr[l]==target && l!=k){
				System.out.println(arr[j]+" "+arr[j-1]);
				break;
			}
		}
	}
}