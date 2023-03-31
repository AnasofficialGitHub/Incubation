import java.util.Scanner;
public class MagicalString{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s= "1221121221221121122";
		System.out.println("Enter a number ");
		int n= scan.nextInt();
		int i,count=0;
		for(i=0;i<n;i++){
			if(s.charAt(i)==49)
				count++;
		}
		System.out.println(count);
	}
}
		