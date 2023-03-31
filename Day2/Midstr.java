import java.util.Scanner;
public class Midstr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.nextLine();
		int mid = (s.length()-1)/2;
		if(s.length()%2==0){
			middle(s,mid);
			middle(s,mid+1);
		}
		else
			middle(s,mid);
	}
	public static void middle(String str, int m){
		System.out.print(str.charAt(m));
	}
}