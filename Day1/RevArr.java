import java.util.Scanner;
public class RevArr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = scan.nextInt();
		int i,j;
		int arr[]= new int[n] ;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		String str=new String();
		for(i=n-1;i>=0;i--)
			str = str+arr[i];
		
		System.out.println("\""+str+"\"");
	}
}