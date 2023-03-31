import java.util.Scanner;
public class Recursion{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the words");
		String s = scan.nextLine();
		rev(s);	
	}
	public static void rev(String s){
		String ss="";
		int i,j,count=0;
		char ch[]=s.toCharArray();
		for(i=ch.length-1;i>=0;i--){
			if(ch[i]==' '){
				System.out.print(ss+" ");
				s="";
				for(j=0;j<ch.length-count-1;j++)
					s=s+ch[j];
				rev(s);
				break;
			}
			else if(i==0){
				ss=ch[i]+ss;
				System.out.print(ss+" ");
			}
			else{
				ss=ch[i]+ss;
				count++;
			}
		}

	}
}
		