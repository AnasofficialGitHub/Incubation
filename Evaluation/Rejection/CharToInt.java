import java.util.Scanner;
public class CharToInt{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lock");
		String s = scan.next();
		char[] c = s.toCharArray();
		int i,ans=0;
		for(i=0;i<s.length();i++)
			ans=ans*26+(c[i]-'A'+1);
		System.out.println(ans);
	}
}