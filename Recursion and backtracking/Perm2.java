import java.util.Scanner;
public class Perm2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		//printcomb(s);
		printcombo(s,1,"");
	}

	public static void printcomb(String input){
		for(int i=0; i< input.length();i++)
			printcomblevel(input,0,0,"",i+1);
	}
	public static void printcomblevel(String input, int idx,int level, String s, int K){
		if ( level == K)
		{
			System.out.println(s);

		} 
		else{
			for(int i=idx; i<input.length(); i++)
				printcomblevel( input, i+1,level+1,s+input.charAt(i),K);
		}
	}
	public static void printcombo(String input,int j,String output) 
        { 
            System.out.println(output);
 		int i;
            for(i =j;i<input.length()-1;i++) 
            { 
                printcombo(input, i+1, output+input.charAt(i+1)); 
            }
        } 

}