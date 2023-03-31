package Ghost;
public class ClassDemo2{
	public static void main(String[] args){
		Test obj = new Test();
		obj.met1();
		obj.met2();
		int result=obj.met3();
		System.out.println(result);
	}
}
class Test{
	int i;
	void met1(){
		int meti=10;
		System.out.println(i);
		System.out.println(meti);
	}
	void met2(){
		System.out.println(i);
	}
	int met3(){
		return 5;
	}
}