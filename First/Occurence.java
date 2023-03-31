import java.util.Scanner;
public class Occurence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		String s = scan.nextLine();
		int counter,i=0,j,k,flag=0;
		char ans;
		char ch[] = new char[s.length()];
		Label1:
		for(;i<s.length();i++){
			counter=0;;
			ch[i]=s.charAt(i);
			for(k=0;k<i;k++){
				if(s.charAt(i)==ch[k])
					continue Label1;
			}
			for(j=i;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j))
					counter++;
			}
			System.out.println(s.charAt(i)+"="+counter);
		}
	}
}
			
					
		