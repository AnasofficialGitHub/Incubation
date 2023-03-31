public class InherDemo2{
	public static void main(String[] args){
		Square s = new Square();
		s.smet();
		s.rmet();
		
	}
}
class Shape{
	public void smet(){
		System.out.println("This is this is shape");
	}
}
class Rectangle extends Shape{
	public void rmet(){
		System.out.println("This is Rectangle");
	}
}
class Circle extends Shape{
	public void cmet(){
		System.out.println("This is Circle");
	}
}
class Square extends Rectangle{
	public void ssmet(){
		System.out.println("Rectangle is square");
	}
}