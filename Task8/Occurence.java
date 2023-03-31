import java.util.Scanner;
public class Occurence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words : ");
		String s = scan.next();
		char ch[] = s.toCharArray();
		int i,j;
		for(i=0;i<s.length();i++){
			int count=1;
			if(ch[i]==' ')
				continue;
			for(j=i+1;j<s.length();j++){
				if(ch[i]==ch[j]){
					count++;
					ch[j]=' ';
				}
			}
			System.out.print(ch[i]+""+count);
		}
	}
}