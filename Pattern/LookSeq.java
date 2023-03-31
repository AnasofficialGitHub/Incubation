import java.util.Scanner;
public class LookSeq{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		String s[]=new String[n];
		s[0]="1 ";
		for(int i=1;i<n;i++)
			s[i]="";
		
		for(int i=0;i<n-1;i++){
			int count=1;
			System.out.println(s[i]);
			for(int j=0;j<s[i].length();j+=2){
				if(j!=s[i].length()-2 && s[i].charAt(j)==s[i].charAt(j+2))
					count++;
				else{
					s[i+1]+=count;
					s[i+1]+=' ';
					s[i+1]+=s[i].charAt(j);
					s[i+1]+=' ';
					count=1;
				}
			}
		}
		System.out.println(s[n-1]);	
	}
}