public class Inherdemo{
	public static void main(String[] args){
		Parent p = new Parent();
		Child c = new Child();
		p.met();
		c.met1();
		c.met();	// can call the method of parent class using child class object
		//p.met1();    cant call the method of child class with parent object

	}
}
class Parent{
	private void met(){
		System.out.println("Parent class ");
	}
}
class Child extends Parent{
	public void met1(){
		met();
		System.out.println("Child class");
	}
}