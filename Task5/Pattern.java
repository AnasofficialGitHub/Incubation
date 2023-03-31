import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		System.out.println("Enter the Pattern");
		String p = scan.next();
		boolean b=true;
		char ch[] = p.toCharArray();
		int i,j,count=0,flag=0;
		for(i=0;i<p.length();i++){
			if(p.charAt(i)=='*' || p.charAt(i)=='.')
				count++;
		}
		if(s.length()<=p.length()){
			for(i=0;i<s.length();i++){
					for(j=0;j<p.length();j++){
						if(s.charAt(i)==ch[j]){
							flag=1;
							ch[j]='-';
							break;
						}
						else if(j==s.length()-1){
							if(count>0)
								flag=1;
								count--;
								break;
						}
						else
							flag=0;
					}
			}
		}
		else
			b=false;
		if(flag==0)
			b=false;
		else
			b=true;
		System.out.println(b);
	}
}