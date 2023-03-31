import java.util.Scanner;
import java.util.*;
public class Recursion{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] s = new String[100];
		System.out.println("Enter the number of words");
		int n = scan.nextInt();
		System.out.println("Enter the words");
		for(int i=0;i<n;i++)
		{
			s[i] = scan.next(".");
			
		}
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(s[j]+" ");
		}
	}
}