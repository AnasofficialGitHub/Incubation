import java.util.Scanner;
public class Reversevowels{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String s = scan.next();
		int i,j;
		char temp;
		char c[] = s.toCharArray();
		for(i=0;i<s.length();i++){
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
			{
				for(j=i+1;j<s.length();j++){
					if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u' || c[j]=='A' || c[j]=='E' || c[j]=='I' || c[j]=='O' || c[j]=='U')
					{
						temp=c[i];
						c[i]=c[j];
						c[j]=temp;
						i=j-1;
						break;
					}

				}
			}
		}
		s="";
		for(i=0;i<c.length;i++)
			s=s+c[i];
		System.out.println(s);
	}
}