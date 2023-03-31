import java.util.Scanner;
public class OccSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		int i,j,k,count=0,counter=0,temp;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				count=0;counter=0;
				for(k=0;k<n;k++){
					if(arr[j]==arr[k])
						count++;
				}
				for(k=0;k<n;k++){
					if(j==n-1 && arr[j-1]==arr[k])
						counter++;
					else if(j!=n-1 && arr[j+1]==arr[k])
						counter++;
				}
				if(j!=n-1 && count<counter){
					swap(j,j+1,arr);
				}
				else if(j==n-1 && count>counter){
					swap(j,j-1,arr);
				}
				else if(j!=n-1 && count==counter){
					for(int l=0;l<n;l++){
						if(arr[l]==arr[j])
							break;
						else if(arr[l]==arr[j+1]){
							swap(j,j+1,arr);
							break;
						}
					}
				}
				else if(j==n-1 && count==counter){
					for(int l=0;l<n;l++){
						if(arr[l]==arr[j-1])
							break;
						else if(arr[l]==arr[j]){
							swap(j-1,j,arr);
							break;
						}
					}
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
	static void swap(int a ,int b,int arr[]){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}