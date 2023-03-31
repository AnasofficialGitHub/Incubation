import java.util.Scanner;
public class Vowelskip{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String s=scan.next();
		int i,j;
		char ch[] = s.toCharArray();
		for(i=0;i<s.length();i++){
			if(check(ch,i)){
				int count=0;
				for(j=i+1;j<s.length();j++){
					if(check(ch,j)){
						count++;
					}
					else{
						i=j-1;
						break;
					}
				}
				if(count==0)
					ch[i]=' ';
			}
		}
		s="";
		for(i=0;i<ch.length;i++)
			if(ch[i]!=' ')
				s+=ch[i];	
		System.out.println(s);		
	}
	static boolean check(char ch[],int i){
		if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U'
		|| ch[i]=='a' || ch[i]=='i' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u')
			return true;
		else
			return false;
	}
}