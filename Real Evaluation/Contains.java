import java.util.Scanner;
public class Contains{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = scan.nextLine();
		System.out.println("Enter the word");
		String str = scan.nextLine();
		System.out.println(contains(s,str));
	}
	public static boolean contains(String s,String str){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==str.charAt(0)){
				boolean flag=true;
				for(int j=0,k=i;j<str.length();j++,k++){
					if(s.charAt(k)==str.charAt(j))
						continue;
					else{
						flag=false;
						break;
					}
				}
				if(flag)
					return true;
			}
		}
		return false;
	}
	
}