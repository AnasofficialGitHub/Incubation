import java.util.Scanner;
public class Finves{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the invesment amount : ");
		Double pv = scan.nextDouble();
		System.out.println("Input the rate of intrest : ");
		Double i = scan.nextDouble();
		System.out.println("Input the number of years : ");
		int n = scan.nextInt();
		double fv ;
		System.out.println("Years\tFutureValue");
		for(int j=1;j<=n;j++){
			fv = inves(pv, i, j);
			System.out.println(j+"\t"+fv);
		}
	}
	public static double inves(double x, double y, int z){
		double result;
		result = (double)x*(power((1+y/100),(z)));
		return result;
	}
	public static double power(double a, int b){
		double c=1;
		for(int i=1;i<=b;i++){
			c=c*a;
		}
		return c;
	}
}