import java.util.Scanner;
public class Parenthesis{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s= scan.nextLine();	
		int r=0,l=0;	
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='(')
				r++;
			else if(s.charAt(i)==')')
				l++;
		}
		if(l==r)
			System.out.println(0);
		else
			System.out.println(1);	
	}
}