import java.util.Scanner;
public class RemVow{
	public static void main(String[] args){
		int i,j;
		char temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input: ");
		String s = scan.next();
		char ch[] = s.toCharArray();
		for(i=0;i<s.length();i++){
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'){
				if(ch[i+1]=='a' || ch[i+1]=='e' || ch[i+1]=='i' || ch[i+1]=='o' || ch[i+1]=='u' || ch[i+1]=='A' || ch[i+1]=='E' || ch[i+1]=='I' || ch[i+1]=='O' || ch[i+1]=='U'){
					
					continue;
				}
				else{
					ch[i]=' ';
				}
				
			}
		}

		String str = new String();
		for(i=0;i<ch.length;i++){
			if(ch[i]==' ')
				continue;
			else
				str = str+ch[i];
		}
		System.out.println(str);
	}
}