import java.util.Scanner;
public class ReverseVowels{
	public static void main(String[] args){
		int i,j,k;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the words");
		String s= scan.next();
		char b[] = s.toCharArray();
		
		
		for(i=0;i<s.length()-1;i++){
			for(j=0;j<s.length()-i-1;j++){
				if(b[j] == 'a' || b[j] == 'e' || b[j] == 'i' || b[j] == 'o' || b[j] == 'u' ){
					for(k=j+1;k<s.length();k++){
						if(b[k] == 'a' || b[k] == 'e' || b[k] == 'i' || b[k] == 'o' || b[k] == 'u' ){
							char temp=b[j];
							b[j]=b[k];
							b[k]=temp;
						}
					}
					
				}
			}
		}
		for(i=0;i<s.length();i++){
			System.out.print(b[i]);
		}
	
	}
	
}