import java.util.Scanner;
public class Holiday{
	private String name;
	private int date;
	private String month;
	public static void main(String[] args){
		Holiday obj = new Holiday("Independence Day",4,"june");
	}
	public Holiday(String name, int date, String month){
		this.name = name;
		this.date = date;
		this.month = month;
	}
	public boolean inSameMonth(){
		return true;
	}
	public double avgDate(int arr[]){
		
	}
}