import java.util.Scanner;
public class Occurence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first string");
		String s=scan.next();
		System.out.println("Enter the second string");
		String str=scan.next();
		int i,j;
		int min=100,max=0;
		for(i=0;i<str.length();i++){
			int flag=0;
			for(j=0;j<s.length();j++){
				if(str.charAt(i)==s.charAt(j)){
					flag=1;
					if(min>j)
						min=j;
					if(max<j)
						max=j;	
				}
				if(flag==1)
					break;
			}
		}
		for(i=min;i<=max;i++)
			System.out.print(s.charAt(i));

	}
}