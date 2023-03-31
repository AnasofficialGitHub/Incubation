import java.util.Scanner;
public class SumofDivisor{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int i,result=0;
		for(i=1;i<=n/2;i++){
			if(n%i==0){
				result=result+i;
			}
		}
		if(result==n)
			System.out.println("true");
		else
			System.out.println("false");
	}
}