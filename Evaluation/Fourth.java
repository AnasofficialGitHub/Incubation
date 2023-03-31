import java.util.Scanner;
public class Fourth{
	public static void main(String[] args){
		int arr[] = new int[10];
		int i,j,temp,counter=0,count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int len = scan.nextInt();
		for(i=0;i<len;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the number");
		int n = scan.nextInt();
		for(i=0;i<len;i++){
			for(j=0;j<len-1;j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int a[] = new int[len];
		Label1:
		for(i=0;i<len;i++){
			for(j=0;j<i;j++){
				if(arr[i]==arr[j]){
					count++;
					continue Label1;
				}
			}
			a[i]=arr[i];
			
		}
		for(i=0;i<len-count;i++){
			for(j=i;j<len-count-1;j++){
				if(a[i]+a[j]==n)
					System.out.println(arr[i]+","+a[j]);
					counter++;
				
			}
		}
		if(counter==0)
			System.out.println("no pair exist for "+n);
	}
}