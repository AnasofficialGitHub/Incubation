import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String s = scan.nextLine();
		int i,count=0,sp=0;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)>=32 && s.charAt(i)<=47 || s.charAt(i)>=58 && s.charAt(i)<=64){
				count++;
				print(s,sp,i,count);
				sp=i;
			}
			else if(i==s.length()-1){
				count++;
				print(s,sp,i,count);
			}	
		}
	}
	static void print(String s,int sp,int i,int count){
		int j;
		if(count%2!=0){
			for(j=i-1;j>=sp;j--)
				System.out.print(s.charAt(j));
		}
		else{
			for(j=sp;j<=i;j++)
				System.out.print(s.charAt(j));
		}
	}
}