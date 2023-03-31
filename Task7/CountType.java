import java.util.Scanner;
public class CountType{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers");
		int i,od=0,ev=0,zo=0,pve=0,nve=0;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]%2==0){
				ev++;
				if(arr[i]<0)
					nve++;
				else if(arr[i]>0)
					pve++;
				else
					zo++;
			}
			else{
				od++;
				if(arr[i]<0)
					nve++;
				else if(arr[i]>0)
					pve++;
			}
		}
		System.out.println("Positive numbers : "+pve+"\nNegative Numbers : "+nve+"\nOdd Numbers : "+od+"\nEver Numbers : "+ev+"\nZero : "+zo);
	}
}