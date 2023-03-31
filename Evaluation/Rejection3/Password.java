import java.util.Scanner;
public class Password{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password : ");
		String s=scan.next();
		int caps=0,small=0,num=0,special=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>64 && s.charAt(i)<=90)
				caps++;
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
				small++;
			else if(s.charAt(i)>=48 && s.charAt(i)<=57)
				num++;
			else if(s.charAt(i)>=33 && s.charAt(i)<=47 ||
				s.charAt(i)>=58 && s.charAt(i)<=64 ||
				s.charAt(i)>=91 && s.charAt(i)<=96 ||
				s.charAt(i)>=123 && s.charAt(i)<=126)	
				special++;
		}
		if(s.length()<8)
			System.out.println("Weak");
		else if(caps>0 && small>0 && num>0 && special>0)
			System.out.println("Strong");
		else if(caps>0 && small>0 && num>0)
			System.out.println("Good");
		else if(caps>0 && small>0)
			System.out.println("Medium");
		else if(caps>0 && num>0)
			System.out.println("Medium");
		else if(num>0 && small>0)
			System.out.println("Medium");
		else
			System.out.println("Weak");
	}
}