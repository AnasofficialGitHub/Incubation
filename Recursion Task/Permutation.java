import java.util.Scanner;
public class Permutation{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char ch[]=s.toCharArray();
		per(ch,0,ch.length-1);
	}
	public static void per(char str[],int l,int r){
		if(l==r){
			for(int j=0;j<=r;j++)
				System.out.print(str[j]);
			System.out.println();
			return;
		}
		for(int i=l;i<=r;i++){
			swap(str,i,l);
			per(str,l+1,r);
			swap(str,i,l);
		}
	}
	public static void swap(char str[],int i,int j){
		char temp=str[i];
		str[i]=str[j];
		str[j]=temp;
	}
}