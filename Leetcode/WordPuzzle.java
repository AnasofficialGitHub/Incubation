import java.util.Scanner;
public class WordPuzzle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row and column");
		int m=scan.nextInt();
		int n=scan.nextInt();
		char[][] box=new char[m][n];
		int i,j;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				box[i][j]=scan.next().charAt(0);
		System.out.println("Enter the number of words");
		int o=scan.nextInt();
		String[] words=new String[o];
		for(i=0;i<o;i++)
			words[i]=scan.next();
		
	}
	public static void solve(char ch[][],String words,int m,int n){
		if(){
			System.out.println(words);
	}
	public static boolean rec(){	
		if(l=words.length())	
			return true;
		for(int i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(ch[i][j]==words.charAt(k)){
					return true;		
	}
	public static 
}