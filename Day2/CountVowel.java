import java.util.Scanner;
public class CountVowel{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = scan.nextLine();
		int c = count(s);
		System.out.println(c);


	}
	public static int count(String str){
		int count = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				count++;
			else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
				count++;
		}
		return count;
	}
}