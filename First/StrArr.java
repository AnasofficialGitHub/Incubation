import java.util.Scanner;
public class StrArr{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words going to enter");
		int n = scan.nextInt();	
		String s[] = new String[50];
		System.out.println("Enter the words : ");
		for(int i=0;i<n;i++)
			s[i]=scan.next( );
		
		char b[]=new char[50];
		for(int j=0,k=1;j<n-1;j++,k++){
			char c[] = s[j].toCharArray();
			char ch[] = s[k].toCharArray();
				for(int l=0;l<ch.length;l++){
					if(c[l]==ch[l])
						b[l]=c[l];
					else
						break;
					
				}
			//s.toCharArray(i)
		
		}
		for(int m=0;m<b.length;m++)
			System.out.printf("%c",b[m]);
		
	}
} 