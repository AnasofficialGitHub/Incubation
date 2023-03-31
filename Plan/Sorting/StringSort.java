import java.util.Scanner;
public class StringSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words :");
		int n=scan.nextInt();
		System.out.println("Enter the words :");
		String s[] = new String[n];
		int i,j;
		for(i=0;i<n;i++)
			s[i]=scan.next();
		for(i=0;i<n;i++){
			int minind=i;
			for(j=0;j<n;j++){
				if(s[j].charAt(0)<s[minind].charAt(0)){
					minind=j;
				}
		  	}
			System.out.print(s[minind]+" ");
			s[minind]="~"+s[minind];
	  	}
		
	}
}