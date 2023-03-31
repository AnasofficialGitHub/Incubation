import java.util.Scanner;
public class Pair{
	public static void main(String[] args){
		int i,j,count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("How much elements");
		int len = scan.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter the numbers");
		for(i=0;i<len;i++)
			arr[i]=scan.nextInt();
		System.out.println("Enter the number ");
		int n = scan.nextInt();
		for(i=0;i<len;i++){
			for(j=i;j<len;j++){
				if(arr[i]+arr[j]==n){ 
					System.out.printf("(%d,%d) ",arr[i],arr[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}