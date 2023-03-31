import java.util.Scanner;
public class Twistedprime{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int remainder,rev=0;
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int flag = prime(n);
		while(n>0){
			remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		flag = prime(rev);
			
		if(flag==0){
			System.out.println("It is a twisted prime number");
		}
		else if(flag==1){
			System.out.println("It is not a twisted prime number");
		}

	}	
	public static int prime(int n){
		int flag = 0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				flag = 1;
		}
		if(flag == 0)
			return 0;
		else
			return 1;
	}		
}	