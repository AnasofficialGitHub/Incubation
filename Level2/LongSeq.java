import java.util.Scanner;
public class LongSeq{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,j,count;
		System.out.println("Enter the words");
		String s=scan.next();
		count=0;
		for(i=0;i<s.length();i++)
			for(j=s.length()-1;j>0;j--){
				if(s.charAt(j)==s.charAt(i)){
					if(s.charAt(i)!=s.charAt(j))
						count++;
					else
						break;
				}
			}
		}	
		System.out.println(count);
	}
}