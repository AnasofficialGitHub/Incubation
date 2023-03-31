import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class BusReservation2{
	public static void main(String[] args){
		Book b = new Book();
		b.home();
	}	
}
class Ticket{
	String name;
	int age;
	String gender;
	long phno;
	String mail;
	char berth;
	String seat;
	String from;
	String to;
	public Ticket(String name,int age,String gender,long phno,String mail,char berth,String seat,String from,String to){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phno=phno;
		this.mail=mail;
		this.berth=berth;
		this.seat=seat;
		this.from=from;
		this.to=to;
	}
	public String toString(){
		return berth+" "+seat+" "+name+" "+age+" "+gender+" "+phno+" "+mail+" "+from+" "+to;
	}
}
@SuppressWarnings("unchecked")
class Book{
	Scanner scan = new Scanner(System.in);
	TreeMap<Integer,Ticket> t = new TreeMap<>();
	int b=0,n=0;
	public Book(){
		for(int i=1;i<=12;i++)
			t.put(i,null);
		for(int i=1;i<=6;i++)
			t.put(i,null);
	}
	public void home(){
		System.out.println("1.Book\n2.View\n3.Cancel");
		int no=scan.nextInt();
		if(no==1)
			book();
		else if(no==2)
			view();
		home();
		
	}
	public void book(){
		if(b==6 && n==12){
			System.out.println("Seats are filled");
			book();
		}
		System.out.println("Normal or Berth (n/b) ");
		char c=scan.next().charAt(0);
		int a=0;
			if(c=='b'){
				a=12;
				if(b>6){
					System.out.println("berth seats are filled");
					return;
				}
			}
			else{
				if(n>12){
					System.out.println("Normal seats are filled");
					return;
				}
			}
			System.out.println("Name : ");
			String name=scan.next();
			System.out.println("Age:");
			int age=scan.nextInt();
			System.out.println("Gender :");
			String m=scan.next();
			System.out.println("Phone number :");
			Long p=scan.nextLong();
			System.out.println("Mail id:");
			String mail=scan.next();
			System.out.println("Pickup:");
			String pick = scan.next();
			System.out.println("Drop:");
			String drop = scan.next();
			System.out.println("Seat Number :");
			String s=scan.next();
			
			//if(t[a+s-1]==null){
				Ticket obj =new Ticket(name,age,m,p,mail,c,s,pick,drop);
				if(c=='n')
					t.put(s,obj);
				else
					t.put("u"+s,obj);
			//}
		//	else{
		//		System.out.println("the seat is booked");
		//	}
		
	}
	public void view(){
		int count=0;
		Set set=t.entrySet();
		Iterator<Map.Entry<String,Ticket>> iter = set.iterator();
		while(iter.hasNext()){
			count++;
			Map.Entry<String,Ticket> me=iter.next();
			if(me.getValue()==null)
				System.out.print(me.getKey()+" ");
			else
				System.out.print(" ");
			if(count%2==0)
				System.out.println();
		}
	}
}