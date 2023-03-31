import java.util.Scanner;
public class Selection{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		int i,j,count=0,v,k;
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
			
		}
		
		for(i=0;i<n;i++){
			int minind=i;
			for(j=i;j<n;j++){
				if(arr[j]<arr[minind])
					minind=j;
		  	}
			if(i!=minind){
				int temp=arr[i];
				arr[i]=arr[minind];
				arr[minind]=temp;
				count++;
			}
	  	}
		if(count>2)
			System.out.println("Not possible");
		else
			System.out.println(count);
	}
}

