import java.util.Scanner;
public class Parenthesis{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the parenthesis");
		String s = scan.next();
		char c[] = s.toCharArray();
		int i,j;
		for(i=0;i<s.length()-3;i++){
			if(c[i]=='(' && c[i+1]==')')
				continue;
			else if(c[i]=='(' && c[i+2]==')')
				continue;
			else if(c[i]=='(' && c[i+3]==')')
				continue;
			else{
				