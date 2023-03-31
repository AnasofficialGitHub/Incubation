import java.util.Scanner;
import java.util.regex.*;
public class PatterRegex{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		System.out.println("Enter the Pattern");
		String p = scan.next();
		System.out.println(Pattern.matches(p,s));
	}
}