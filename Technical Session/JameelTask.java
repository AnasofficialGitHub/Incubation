import java.util.Scanner;
public class JameelTask{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle");
		int l=scan.nextInt();
		int b=scan.nextInt();
		Rectangle obj = new Rectangle(l,b);
		System.out.println(obj.Area());
	}
}
class Rectangle{
	int length,breadth;
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public int Area(){
		int area = length*breadth;
		return area;
	}
}