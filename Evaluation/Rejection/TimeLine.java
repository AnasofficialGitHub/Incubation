import java.util.Scanner;
public class TimeLine{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of the Sentence");
		int n=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Sentence");
		String s[] = new String[n];
		int arr[] = new int[n];
		int i,j;
		String str;
		for(i=0;i<n;i++){
			str=scan.nextLine();
			s[i]=str;
		}
		for(i=0;i<n;i++){
			arr[i]=1;
			char c[]=s[i].toCharArray();
			for(j=s[i].length()-5;j<s[i].length()-2;j++){
				arr[i]*=(int)c[j]*10;
			}
		}
		for(i=0;i<n;i++)
			System.out.println(arr[i]);	

	}
}