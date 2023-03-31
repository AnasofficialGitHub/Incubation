package Ghost;
public class ClassDemo3{
	public static void main(String[] args){
		Bank obj = new Bank();
		System.out.println(obj.depositcash(900));
	}
}
class Bank{
	boolean depositcash(int cash){
		if(cash<1000)
			return true;
		else
			return false;
	}
	String getName(){
		return "anas";
	}
	long getMoney(){
		return 10L;
	}
}