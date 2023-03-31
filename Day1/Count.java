import java.util.Scanner;
public class Count{
	public static void main(String[] args){
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String s = scan.next();
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		for(i=1;i<=n;i++)
			System.out.print(s);
	}
}