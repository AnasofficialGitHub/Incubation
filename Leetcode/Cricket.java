import java.util.Scanner;
public class Cricket{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of teams : ");
		int n=scan.nextInt();
		System.out.println(matches(n));
	}
	public static int matches(int n,int sum){
		if(n==1)
			return 0;
		if(n%2!=0){
			sum+=n/2;
			n=n/2+1;
			return matches(n)+n-1;	
		}
		else{
			sum+=n/2;
			n=n/2;
			return matches(n)+n;	
		}
	}
}