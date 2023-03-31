import java.util.Scanner;
public class Excel{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Password");
		String s = scan.next();
		int i,x=0;
		char ch[] = s.toCharArray();
		for(i=0;i<s.length();i++)
			x=x*26+(ch[i]-'A'+1);
		System.out.println(x);
	}
}