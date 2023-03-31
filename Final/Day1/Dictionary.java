import java.util.Scanner;
public class Dictionary{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s[] = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
		System.out.println("Enter the String");
		String str=scan.nextLine();
		int i,j,k,flag=0;
		for(i=0;i<str.length();i++){
			flag=0;
			for(j=0;j<s.length;j++){
				for(k=0;k<s[j].length();k++){
					if(str.charAt(i)==s[j].charAt(k)){
						flag=1;
						continue;
					}
				}
			}
			if(flag==0){
				System.out.println("No");
				return;
			}
		}
		System.out.println("yes");
	}
}