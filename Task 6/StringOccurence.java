import java.util.Scanner;
public class StringOccurence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words");
		String s=scan.nextLine();
		int i,j=0,count=0;
		String str[] = new String[100];
		for(i=0;i<s.length();i++){
			str[i]="";
			count++;
			for(;j<s.length();j++){
				if(s.charAt(j)==' '){
					j++;
					break;
				}
				str[i]=str[i]+s.charAt(j);
			}
			
		}
		for(i=0;i<count;i++){
			for(j=0;j<count;j++){
				if(str[i].equals(str[j]) && i!=j){
					str[j]="";
				}
			}
		}
		for(i=0;i<count;i++)
			System.out.print(str[i]+" ");
	}
}