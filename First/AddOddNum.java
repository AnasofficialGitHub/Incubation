import java.util.Scanner;
public class AddOddNum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();
		int sum=0;
		for(int i=1;i<=n*2;i++){
			if(i%2!=0){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.printf("Sum of odd natural number upto %d term is %d",n, sum);
	}
}