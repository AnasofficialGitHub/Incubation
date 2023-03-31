import java.util.Scanner;
public class Consecutive{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,n,j,temp,flag=0,r=0;
		System.out.println("Enter the number of elements:");
		n=scan.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
			a[i] = scan.nextInt();
		for(i=0;i<n;i++){
			for(j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		for(i=0;i<n-1;i++){
			if(a[i+1]==a[i]+1)
				flag=0;
			else if(a[i]==a[i+1]){
				flag=1;
				r=a[i];
				break;
			}
			else{
				System.out.println("The array contains consecutive integers for "+a[0]+" to "+a[i]);
				flag=2;
				break;
			}
		}
		if(flag==0)
			System.out.println("The array contains consecutive integers for "+a[0]+" to "+a[n-1]);
		else if(flag==1)
			System.out.println("The array doesnt contains consecutive integers as element "+r+" is repeated.");
		
	

			
	}
}