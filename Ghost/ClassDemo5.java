package Ghost;
public class ClassDemo5{
	public static void main(String[] args){
		Demo2 obj = new Demo2();
		obj.met1(1,3,null);
		obj.met2(1,2,"anas",new String("anas"),new Demo2());
		obj.met3(new Object[] {"anas",new Demo2(),3,new String("anas")});
		int a[] = {1,2,3};
		obj.met4(new Anas());
	}
}
class Demo2{
	void met1(int a, int b, String c){
	}
	void met2(Object ...o){
		System.out.println(o.length);
		for(int i=0;i<o.length;i++)
			System.out.println(o[i]);
	}
	void met3(Object obj[]){
	
	}
	void met4(Anas ...a){
	
	}
}
class Anas{
	
}
class Annas{
}