import java.util.Scanner;
public class Stringcomp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string");	
		String s=scan.next();
		System.out.println("Enter the second string");	
		String str=scan.next();
		String temp="",temp1="";
		boolean b=true;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==str.charAt(i)){
				print(temp,temp1);
				temp="";temp1="";
				b=false;
				continue;
			}
			else{
				temp+=s.charAt(i);
				temp1+=str.charAt(i);
				b=true;	
			}
		}
		if(b)
			print(temp,temp1);
	}
	private static void print(String temp,String temp1){
		if(temp.length()!=0){
			System.out.println(temp+","+temp1);
			
		}
	}
}