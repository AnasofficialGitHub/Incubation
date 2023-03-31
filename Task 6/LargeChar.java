import java.util.Scanner;
public class LargeChar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words going to enter");
		int n=scan.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the words ");
		int i,j,k,l;
		char temp;
		for(i=0;i<n;i++)
			s[i]=scan.next();
		for(i=0;i<n;i++){
			char[] str=s[i].toCharArray();
			for(j=0;j<str.length-1;j++){
				for(k=0;k<str.length-i-1;k++){
					if(str[k]<str[k+1]){
						temp=str[k];
						str[k]=str[k+1];
						str[k+1]=temp;
					}
				}
			}
			s[i]="";
			for(l=0;l<str.length;l++)
				s[i]+=str[l];
		}
		for(i=0;i<n;i++)
			System.out.print(s[i]+" ");
			
	}
}