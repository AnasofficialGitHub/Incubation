import java.util.Scanner;
public class LexicoGraphic{
	public static void main(String[] args){
		int i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word ");
		String s = scan.next();
		char ch[] = s.toCharArray();
		char c[] = new char[s.length()];
		//for(i=0;i<s.length();i++)
		//{
			//if(ch[i]=='a')
			//{
				//System.out.print(ch[i]);
				for(j=0;j<s.length();j++)
				{
					for(k=j;k<s.length;k++)
					{
						
							
					
					
				