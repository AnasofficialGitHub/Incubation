import java.util.Scanner;
public class Anagram{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words");
		String s = scan.nextLine();
		int arr[]=new int[26];
		int i,j;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
				arr[s.charAt(i)-65]=1;
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
				arr[s.charAt(i)-97]=1;
			else
				continue;
		}
		boolean b=true;
		for(i=0;i<26;i++){
			if(arr[i]==0){
				b=false;
				break;
			}
		}
		System.out.println(b);	
	}
}