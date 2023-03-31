import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = scan.next();
		int i,count=0;
		String str="";
		str+=s.charAt(0);
		for(i=1;i<s.length();i++){
			str+=s.charAt(i);
			if(str.equals(rev(str))){
				System.out.print(str+" ");
				str="";
				count++;
				if(i==s.length()-1)
					break;
				str+=s.charAt(i+1);
				i++;
			}
		}
		if(count<2)
			System.out.println("Cant split");
	}	
	static String rev(String s){
		String str="";
		for(int i=s.length()-1;i>=0;i--)
			str+=s.charAt(i);
		return str;
	}
}