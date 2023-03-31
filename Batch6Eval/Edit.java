import java.util.Scanner;
public class Edit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	
		System.out.println("Enter the string ");
		String s = scan.next();
		System.out.println("Enter the two string ");
		String str=scan.next();
		int mis=0;
		int len = str.length()-s.length();
		if(len==0 || len==1 || len==-1){
			for(int i=0,j=0;i<s.length() && j<str.length();i++,j++){
				if(s.charAt(i)==str.charAt(j))
					continue;
				else
					mis++;
			}
		}
		else{
			System.out.println("false");
			return;
		}
		if(len==1 || len==-1)
			mis++;
		if(mis>1)
			System.out.println("false");
		else
			System.out.println("true");
	}
}