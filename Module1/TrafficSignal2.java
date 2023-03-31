import java.util.Scanner;
public class TrafficSignal2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of signals");
		int n=scan.nextInt();
		Signal s = new Signal();
		while(true){
			for(int i=1;i<=n;i++){

			}
		}	
	}
}
class Signal{
	Direction d = new North();
	public void go(){
		s.travel(this);
	}
}
abstract class Direction{
	public abstract void travel(Go go);
}
class North extends Direction{
	
	public North(){
		
	}
	public void travel(Go go){
		System.out.println("Signal 1 : "+NS+" "+EW);
		if(i==1)
			go.s=new Signal2("Green ");
		else
			go.s=new Signal2("Red ");
		go.s.travel(go,i);
	}
}

class East extends Direction{
	public East(){

	}
	public void travel(Go go,int i){
		if(i==1)
			go.s=new Signal4("Red ");
			
		else
			go.s=new Signal4("Green ");
		System.out.println("Signal 3 : "+NS+" "+EW);
		go.s.travel(go,i);
	}
}