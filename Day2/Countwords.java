import java.util.Scanner;
public class Countwords{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s = scan.nextLine();
		int count = counter(s);	
		System.out.println(count);
		
		
	}
	public static int counter(String str){
		int counter = 0;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i+1) >= 'a' && str.charAt(i+1) <= 'z' || str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'Z')
				continue;
			else if(str.charAt(i-1)>=35 && str.charAt(i-1)<=46 || str.charAt(i-1)==64 || str.charAt(i-1) == ' ')
				continue;
			else
				counter++;
	        }
		if(str.charAt(str.length()-1) >= 'a' && str.charAt(str.length()-1) <= 'z' || str.charAt(str.length()-1) >= 'A' && str.charAt(str.length()-1) <= 'Z')
			counter++;
		return counter;
	
	
	}
}