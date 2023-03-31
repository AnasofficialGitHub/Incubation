import java.util.Scanner;
public class StringPalindrome{
	public static void main(String[] args){
		int i,j;
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len=s.length()/2;
		if(s.length()%2==0)
			j=len;
		else
			j=len+1;
		for(i=len-1;i>=0;i--,j++){
			if(s.charAt(i)==s.charAt(j))
				continue;
			else