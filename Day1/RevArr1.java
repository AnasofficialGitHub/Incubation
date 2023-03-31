import java.util.Scanner;
public class RevArr1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = scan.nextInt();
		int i,j;
		char temp;
		int arr[]= new int[n] ;
		for(i=0;i<n;i++)
			arr[i]=scan.nextInt();
		String str=new String();
		for(i=n-1;i>=0;i--)
			str = str+arr[i];
		char ch[] = str.toCharArray();
		for(i=0;i<str.length()-i-1;i++){
			for(j=0;j<str.length()-1;j++){
				if(ch[j]<ch[j+1]){
					temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		String s = new String(ch);
		System.out.println("\""+s+"\"");
	}
}