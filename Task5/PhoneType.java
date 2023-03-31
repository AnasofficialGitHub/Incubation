import java.util.Scanner;
public class PhoneType{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int n = scan.nextInt();
		int r=n;
		int i,count=0;
		while(r!=0){
			r=r/10;
			count++;
		}
		while(count>0){
			
	}
}