import java.util.Scanner;
public class Uniqueword{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=scan.next();
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				if(i!=j && c[i]==c[j] || c[i]==c[j]+32 || c[i]==c[j]-32){
					System.out.println(false);
					return;
				}
			}
		}
		System.out.println(true);
	}
}