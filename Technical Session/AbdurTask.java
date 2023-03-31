import java.util.Scanner;
public class AbdurTask{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Average a = new Average();
		System.out.println("Enter the numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		a.print(n1,n2,n3);
	}
}
class Average{
	public void print(int no1,int no2,int no3){
		int result= no1 + no2 + no3;
		result=result/3;
		System.out.println(result);
	}
}