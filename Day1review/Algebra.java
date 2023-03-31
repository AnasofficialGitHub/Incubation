import java.util.Scanner;
public class Algebra{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int c = scan.nextInt();
		int i,j;
		boolean b = find(c);
		System.out.println(b);
	}
	public static boolean find(int c){
		int a,b,r;
		for(a=0;a<c;a++){
			for(b=0;b<c;b++){
				r=power(a,a)+power(b,b);
				if(r==c){
					return true;
				}
			}
		}
		return false;
	}
	public static int power(int x,int y){
		int temp = x;
		for(int i=1;i<y;i++){
			x*=temp;
		}
		return x;
	}
}