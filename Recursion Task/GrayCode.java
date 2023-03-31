import java.util.Scanner;
public class GrayCode{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Binary Code");
		String s=scan.next();
		char ch[]=s.toCharArray();
		solve(ch,0);
	}
	public static void solve(char[] c,int i){
		if(i==c.length)
			return;
		else if(i==0){
			System.out.print(c[i]);
			solve(c,i+1);
			return;
		}
		else if(c[i]!=c[i-1]){
			System.out.print("1");
			solve(c,i+1);
			return;
		}
		else{
			System.out.print("0");
			solve(c,i+1);
		}
	}
}