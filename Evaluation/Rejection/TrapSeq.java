import java.util.Scanner;
public class TrapSeq{
	static int yy;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("N1 : ");
		int n1=scan.nextInt();
		System.out.println("N2 : ");
		int n2=scan.nextInt();
		System.out.println("y : ");
		int y=scan.nextInt();
		int i;
		yy=y;
		boolean ans=false;
		for(i=n1;i<=n2;i++){
			ans=trap(i);
			if(ans)
				System.out.print(i+" ");
			
		}
	}
	public static int addigits(int a){
		int r=0;
		while(a>0){
			r=r+(a%10);
			a=a/10;
		}
		return r;
	}
	public static boolean trap(int i){
			int j=i;
			boolean ans=false;
			if(i==yy || i%yy==0 || yy%i==0){
				yy=yy+2;
				return true;
			}
			else{
				yy--;
				if(yy<3)
					yy=3;
				if(i>9){
					i=addigits(i);
					return trap(i);
				}
				return false;
			}
		
	}
	
}
		