package Ghost;
public class ClassDemo4{
	public static void main(String[] args){
		Demo demo = new Demo();
		demo.met(20,10,"anas");
		int a[] = new int[] {1,2,3,4,5};
		demo.met1(a);
		demo.met1(new int[] {1,2,3,4,5});
		demo.met2(1,2,3,4,5,6,7,8,9,10);
		int b[] = demo.met2(10,201,30,40,50);
		for(int i:b)
			System.out.println(i);
		demo.met3(1,2,"anas",'a',1.1,true,new Demo());
	}
}
class Demo{
	void met(int a, int b, String s){
		System.out.println(a+" "+b+" "+s);
	}
	void met1(int a[]){
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(int i:a)
			System.out.println(i);
	}
	int[] met2(int... abc){
		for(int i:abc){
			System.out.println(i);  //i is value
		}				//abc is address
		return abc;
	}
	void met3(Object ...o){
		for(Object c:o)
			System.out.println(c);
	}
	void met4(int... abc){
		for(int i:abc){
			System.out.println(i);
		}
	}
}
	