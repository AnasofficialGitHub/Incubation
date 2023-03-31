public class InherDemo3{
	public static void main(String[] args){
		Square obj = new Square(5);

	}
}
class  Rectangle{
	int length;
	int breadth;
	int a,p;
	public void area(){
		System.out.println("Area of Rectangle "+a);
	}
	public void perimeter(){
		System.out.println("Perimeter of Rectangle "+p);
	}
	public Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		a=length*breadth;
		p=2*(length+breadth);
		area();
		perimeter();
	}
}
class Square extends Rectangle{
	public Square(int s){
		super(20,40);
		int ar=s*s;
		int pr=4*s;
		System.out.println("Area of Square "+ar);
		System.out.println("Perimeter of Square "+pr);
	}
}