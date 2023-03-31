import java.util.Scanner;
public class ReverseAlphabet{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char s = scan.next().charAt(0);
		
		int i,j;
		String sa = "abcdefghijklmnopqrstuvwxyz";
		char b[]= sa.toCharArray();
		//if(s>='a' || s<='m'){
		for(i=0;i<13;i++){
			for(j=25;j>13;j--){
				if(s==b[i]){
					System.out.println(b[j-i]);
					break;
				}
			}
		}
		//}
		//else{
		for(j=25;j>13;j--){
			for(i=0;i<13;i++){
				if(s==b[j]){
					System.out.println(b[i-j]);
					break;
				}
			}
		}
		//}
	}
}