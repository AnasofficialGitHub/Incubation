import java.util.Scanner;
public class Sumchar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i=0,j,count=0;
		System.out.println("Enter the characters: ");
		String s = scan.next();
		char c[] = s.toCharArray();
		System.out.println("Enter the number ");
		int n = scan.nextInt();
		for(i=0;i<n;i++){
			for(j=i;j<s.length();j++){
				if(i==0){
					if(c[i]==c[j])
						count++;
				}
				else if(c[i-1]==c[j])
					continue;
				else{
					if(c[i]==c[j])
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
					