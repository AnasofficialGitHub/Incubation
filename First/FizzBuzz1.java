import java.util.Scanner;

public class FizzBuzz1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		Integer j;
		String s[] = new String[n];
		for(i=0,j=1;i<n;i++,j++){
			if(j%3==0 && j%5==0)
				s[i]="FizzBuzz";
			else if(j%5==0)
				s[i]="Buzz";
			else if(j%3==0)
				s[i]="Fizz";
			else
				s[i]=j.toString();
		}
		System.out.print("[");
		for(i=0;i<n;i++)
			System.out.printf("\"%s\", ",s[i]);
		System.out.print("]");
	}
}