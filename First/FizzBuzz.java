import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		for(i=1;i<=n;i++){
			if(i%3==0 && i%5==0)
				System.out.print("FizzBuzz ");
			else if(i%5==0)
				System.out.print("Buzz ");
			else if(i%3==0)
				System.out.print("Fizz ");
			else
				System.out.print(i+" ");
		}
	}
}