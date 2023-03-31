import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class LiftManagement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of floors : ");
		int f=scan.nextInt();
		System.out.println("Enter 1 if any lift is under maintenanace else enter 0");
		int y=scan.nextInt();
		int m=0;
		if(y==1){
			System.out.println("Enter the number of lift under maintenance ");
			m=scan.nextInt();
		}
		Lift lf = new Lift(f,m);
		lf.home();
	}
}
class Lift{
	Map<String, Integer> lift = new HashMap<>();
	int floor;
	public Lift(int f, int m){
		for(int i=1;i<=5;i++)
			lift.put("L"+i,0);
		floor=f;
		if(m!=0)
			lift.put("L"+m,-1);
	}
	public void home(){
		Scanner scan = new Scanner(System.in);
		print();
		System.out.println("Current Floor : ");
		int cf=scan.nextInt();
		System.out.println("Going Floor : ");
		int gf=scan.nextInt();
		System.out.println("Enter the members : ");
		int mm=scan.nextInt();
		assign(cf,gf,mm);
		
	}
	public void print(){
		System.out.println("L1 L2 L3 L4 L5");
		for(int i=1;i<=lift.size();i++)
			System.out.print(" "+lift.get("L"+i)+" ");
		System.out.println();
	}
	public void assign(int cf,int gf, int mm){
		int i,j;
		for(i=0;i<=floor;i++){
			for(Entry<String, Integer> entry : lift.entrySet()){
				if(entry.getValue() == cf+i || entry.getValue() == cf-i){
					System.out.println(entry.getKey()+" is assigned");
					lift.put(entry.getKey(),gf);
					home();
					return;
				}
			}
		}
	}
}