import java.util.*;
import java.io.*;
public class Gpay{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		IndianBank ib=IndianBank.create();
		AmericanBank ab=AmericanBank.create();
		Apay a = Apay.create(ib,ab);
		//serialize(a,ib,ab);
		//deSerialize(a,ib,ab);
		try{
		FileInputStream fo=new FileInputStream("C:\\Users\\Administrator\\Documents\\SerializedObjects\\Apay.txt");
		ObjectInputStream oo=new ObjectInputStream(fo);
		a=(Apay)oo.readObject();
		//ib=(IndianBank)oo.readObject();
		//ab=(AmericanBank)oo.readObject();
		}
		catch(Exception e){}
		System.out.println("1.Bank\n2.Apay");
		int n=scan.nextInt();
		switch(n){
			case 1:
				System.out.println("1.IndianBank\n2.AmericanBank\n3.Exit");
				n=scan.nextInt();
				if(n==1)
					ib.register();
				else if(n==2)
					ab.register();
				break;
			case 2:
				a.login();
				break;
			default:
				serialize(a,ib,ab);
				System.exit(0);
		}
		main(null);	
	}
	public static void serialize(Apay a,IndianBank ib,AmericanBank ab){
		try{
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Administrator\\Documents\\SerializedObjects\\Apay.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(a);
		//oo.writeObject(ib);
		//oo.writeObject(ab);
		}
		catch(Exception e){}
	}
	public static void deSerialize(Apay a,IndianBank ib,AmericanBank ab){
		try{
		FileInputStream fo=new FileInputStream("C:\\Users\\Administrator\\Documents\\SerializedObjects\\Apay.txt");
		ObjectInputStream oo=new ObjectInputStream(fo);
		a=(Apay)oo.readObject();
		//ib=(IndianBank)oo.readObject();
		//ab=(AmericanBank)oo.readObject();
		}
		catch(Exception e){}
	}
}
class Apay implements Serializable{
	private static Apay obj;
	private ArrayList<User> us = new ArrayList<User>();
	private Bank ib;
	private Bank ab;
	Scanner scan = new Scanner(System.in);
	static int a=10;
	private Apay(Bank ib,Bank ab){
		this.ib=ib;
		this.ab=ab;
	}
	public static Apay create(Bank ib,Bank ab){
		if(obj==null)
			obj=new Apay(ib,ab);
		return obj;
	}
	public void login(){
		System.out.println("----------Apay------------\n1.Signup\n2.Signin\n3.exit");
		int n=scan.nextInt();
		if(n==1){
			signup();
		}
		else if(n==2){
			signin();
		}
		else if(n==4){
			System.out.println(a);
			Iterator it=us.iterator();
			while(it.hasNext())
				System.out.println(it.next());
		}
		else{
			Gpay.main(null);
		}	
	}
	private void home(int i){
		System.out.println("-------HOME--------\n1.Add account\n2.Send Money\n3.Self Transfer\n4.History\n5.Back");
		int n=scan.nextInt();
		switch(n){
			case 1:
				add();
				break;
			case 2:
				send(i);
				break;
			case 3:
				self();
				break;
			case 4:
				history();
				break;
			default:
				login();
		}
	}
	private void add(){


	}
	private void send(int i){
		System.out.println("Number : ");
		int num=scan.nextInt();
		boolean flag=true;
		int j;
		for(j=0;j<us.size();j++){
			if(us.get(j).getPhone()==num){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("The number is not in Apay invite them");
			home(i);
		}
		System.out.println("Enter the Bank\n1.Indian Bank\n2.American Bank");
		int n=scan.nextInt();
		System.out.println("Enter the amount :");
		long mon=scan.nextLong();
		System.out.println("Enter the pin :");
		int pin=scan.nextInt();
		if(us.get(i).getPin()==pin){
			String s=us.get(j).getPrimary();
			if(n==1){
				ib.send(us.get(i).getPhone(),mon);
			}
			else if(n==2){
				ab.send(us.get(i).getPhone(),mon);
			}
			if(s.charAt(0)=='I'){
				ib.recieve(num,mon);
			}
			else if(s.charAt(0)=='A'){
				ab.recieve(num,mon);
			}
		}
		home(i);
	}
	private void self(){

	}
	private void history(){

	}
	private void signup(){
		System.out.println("Name : ");
		String name=scan.next();
		System.out.println("Enter the phone number ");
		int ph=scan.nextInt();
		System.out.println("Add bank account :\n1.Indian Bank\n2.American Bank");
		int n=scan.nextInt();
		boolean b=false;String bank="";
		if(n==1){
			b=ib.checknum(ph);
			int i=ib.acc(ph);
			bank="Indian Bank - "+i;
		}
		else if(n==2){
			b=ab.checknum(ph);
			int i=ab.acc(ph);
			bank="American Bank - "+i;
		}
		if(!b){
			System.out.println("Bank account not available in this number");
			login();
		}
		String pass,rpass;
		int pin,rpin;
		do{
			System.out.println("Create a pin : ");
			pin=scan.nextInt();
			System.out.println("Re enter the Pin:");
			rpin=scan.nextInt();
		}while(!(pin==rpin));
		do{
			System.out.println("Password : ");
			pass=scan.next();
			System.out.println("Re enter the Password :");
			rpass=scan.next();
		}while(!pass.equals(rpass));
		us.add(new User(name,ph,pass,ph+"@apay",bank,pin));
		System.out.println("Signup Sucessfully");
		login();
	}
	private void signin(){
		a=20;
		System.out.println("Phone number : ");
		int ph=scan.nextInt();
		for(int i=0;i<us.size();i++){
			if(us.get(i).getPhone()==ph){
				System.out.println("Password : ");
				String pass=scan.next();
				if(us.get(i).getPass().equals(pass))
					home(i);
			}
		}
		System.out.println("Password is incorrect ");
		login();
	}
}
interface Bank{
	public void send(int num,long mon);
	public void recieve(int num,long mon);
	public long bal(int num);
	public boolean checknum(int num);
	public int acc(int num);
}
class IndianBank implements Bank,Serializable{
	private ArrayList<Customer> cus = new ArrayList<Customer>();
	int acc=191318105;
	Scanner scan = new Scanner(System.in);
	private static IndianBank ibb;
	private IndianBank(){}
	public static IndianBank create(){
		if(ibb==null)
			ibb=new IndianBank();
		return ibb;
	}
	public void register(){
		System.out.println("Name : ");
		String name=scan.next();
		System.out.println("Phone no. : ");
		int phone=scan.nextInt();
		System.out.println("Money : ");
		long money=scan.nextLong();
		String pass,rpass;
		do{
			System.out.println("Password : ");
			pass=scan.next();
			System.out.println("Re enter the Password :");
			rpass=scan.next();
		}while(!pass.equals(rpass));
		System.out.println("Your account number is "+acc);
		acc++;
		cus.add(new Customer(name,phone,money,pass,acc));
		System.out.println("Register successfull");
		
	}
	public boolean checknum(int num){
		for(int i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				return true;
		}
		return false;
	}
	public int acc(int num){
		for(int i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				return cus.get(i).getAcc()%10000;
		}
		return 0;
	}
	public void send(int num,long mon){
		int i;
		for(i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				break;
		}
		if(i!=cus.size()){
		long cash=cus.get(i).getMoney();
		cash-=mon;
		cus.get(i).setMoney(cash);
		System.out.println(cus.get(i).getMoney());
		}
	}
	public void recieve(int num,long mon){
		int i;
		for(i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				break;
		}
		if(i!=cus.size()){
		long cash=cus.get(i).getMoney();
		cash+=mon;
		cus.get(i).setMoney(cash);
		System.out.println(cus.get(i).getMoney());
		}
	}
	public long bal(int num){
		int i;
		for(i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				return cus.get(i).getMoney();
		}
		return 0;
	}
}
class AmericanBank implements Bank,Serializable{
	private ArrayList<Customer> cus = new ArrayList<Customer>();
	int acc=181058054;
	Scanner scan = new Scanner(System.in);
	private static AmericanBank abb;
	private AmericanBank(){

	}
	public static AmericanBank create(){
		if(abb==null)
			abb=new AmericanBank();
		return abb;
	}
	public void register(){
		System.out.println("Name : ");
		String name=scan.next();
		System.out.println("Phone no. : ");
		int phone=scan.nextInt();
		System.out.println("Money : ");
		long money=scan.nextLong();
		String pass,rpass;
		do{
			System.out.println("Password : ");
			pass=scan.next();
			System.out.println("Re enter the Password :");
			rpass=scan.next();
		}while(!pass.equals(rpass));
		System.out.println("Your account number is "+acc);
		acc++;
		cus.add(new Customer(name,phone,money,pass,acc));
		System.out.println("Register successfull");
	}
	public boolean checknum(int num){
		for(int i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				return true;
		}
		return false;
	}
	public int acc(int num){
		for(int i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				return cus.get(i).getAcc()%10000;
		}
		return 0;
	}
	public void send(int num,long mon){
		int i;
		for(i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				break;
		}
		if(i!=cus.size()){
		long cash=cus.get(i).getMoney();
		cash-=mon;
		cus.get(i).setMoney(cash);
		System.out.println(cus.get(i).getMoney());
		}
	}
	public void recieve(int num,long mon){
		int i;
		for(i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				break;
		}
		if(i!=cus.size()){
		long cash=cus.get(i).getMoney();
		cash+=mon;
		cus.get(i).setMoney(cash);
		System.out.println(cus.get(i).getMoney());
		}
	}
	public long bal(int num){
		int i;
		for(i=0;i<cus.size();i++){
			if(cus.get(i).getPhone()==num)
				return cus.get(i).getMoney();
		}
		return 0;
	}
	
}
class Customer{
	private String name;
	private int phone;
	private long money;
	private String pass;
	private int acc;
	public Customer(String name,int phone,long money,String pass,int acc){
		this.name=name;
		this.phone=phone;
		this.money=money;
		this.pass=pass;
		this.acc=acc;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPhone(){
		return phone;
	}
	public void setPhone(int phone){
		this.phone=phone;
	}
	public long getMoney(){
		return money;
	}
	public void setMoney(long money){
		this.money=money;
	}
	public String getPass(){
		return pass;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
	public String toString(){
		return phone+"";
	}
	public int getAcc(){
		return acc;
	}
	public void setAcc(int acc){
		this.acc=acc;
	}	
}
class User{
	private String name;
	private int phone;
	private String pass;
	private String upid;
	private int i=0;
	private String[] bank=new String[4];
	private String primary;
	private int pin;
	public User(String name,int phone,String pass,String upid,String bank,int pin){
		this.phone=phone;
		this.pass=pass;
		this.upid=upid;
		this.name=name;
		this.bank[i]=bank;
		primary=bank;
		i++;
		this.pin=pin;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getPhone(){
		return phone;
	}
	public void setPhone(int phone){
		this.phone=phone;
	}
	public String getPass(){
		return pass;
	}
	public void setPass(String pass){
		this.pass=pass;
	}
	public int getPin(){
		return pin;
	}
	public void setPin(int pin){
		this.pin=pin;
	}
	public String getPrimary(){
		return primary;
	}
	public void setPrimary(String primary){
		this.primary=primary;
	}
}