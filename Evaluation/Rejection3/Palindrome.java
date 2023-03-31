import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.nextLine();
		int i,j=s.length()-1;
		boolean b=true;
		for(i=0;i<s.length() && j>=0;){
			if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122 ){
				if(s.charAt(j)>=97 && s.charAt(j)<=122 ||s.charAt(j)>=65 && s.charAt(j)<=90){
					if(s.charAt(i)==s.charAt(j)){
						i++;
						j--;
					}
					else{
						b=false;
						break;	
					}
				}
				else
					j--;
			}
			else
				i++;
		}
		if(b)
			System.out.println("It is Palindrome");	
		else
			System.out.println("It is not Palindrome");	
	}
}	