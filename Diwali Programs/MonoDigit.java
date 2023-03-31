import java.util.Scanner;
public class MonoDigit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int m=n;
		int i,j,r=0,count=0,digit=1;
		while(n>0){
			r=n%10;
			n=n/10;
			count++;
		}
		for(i=0;i<count-1;i++)
			digit=digit*10;
		System.out.println(digit);
	}
}