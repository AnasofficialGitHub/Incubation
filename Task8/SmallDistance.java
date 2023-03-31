import java.util.Scanner;
public class SmallDistance{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String s = scan.nextLine();
		System.out.println(dis(s));
	}
	static int dis(String s){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word 1 ");
		String w1=scan.next();
		System.out.println("Enter the word 2 ");
		String w2=scan.next();
		String temp="",temp1="";
		int i,j,count=0,sp=0;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)>=32 && s.charAt(i)<=47 || s.charAt(i)>=58 && s.charAt(i)<=64){
				if(temp.equals(w1)){
					for(j=i+1;j<s.length();j++){	
						if(j==s.length()-1 && s.charAt(j)!=' ')
							temp1+=s.charAt(j);
						if(j==s.length()-1 || s.charAt(j)>=32 && s.charAt(j)<=47 || s.charAt(j)>=58 && s.charAt(j)<=64 ){
							
							if(temp1.equals(w2)){
								return count;
							}
							else
								temp1="";
							count++;
						}
						else
							temp1+=s.charAt(j);
					}
				}
				else
					temp="";
			}
			else
				temp+=s.charAt(i);
		}
		return -1;
	}
}