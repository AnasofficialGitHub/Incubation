import java.util.Scanner;
public class Oops1{
	public static void main(String[] args){
		RectangleArea obj = new RectangleArea();
		Scanner scan=new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		obj.read_input(w,h);
		obj.dispaly();
	}
}
class Rectangle{
	int width,height;
	void display(){
		System.out.println(width+" "+height);
	}
}
class RectangleArea extends Rectangle{
	void read_input(int width, int height){
		super.height=height;
		super.width=width;
	}
	void dispaly(){
		super.display();
		System.out.println(width*height);
	}
}
	