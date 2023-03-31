import java.util.Scanner;
public class Arraysum{
	public static void main(String[] args){
		int i,count=0;
		long num=0,num1=0,result,ans;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the digits");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		System.out.println("Enter the digits");
		int n1 = scan.nextInt();
		int b[] = new int[n1];
		for(i=0;i<n1;i++){
			b[i]=scan.nextInt();
		}
		for(i=0;i<n;i++){
			num=num*10+a[i]*10;
			
		}
		for(i=0;i<n1;i++){
			num1=num1*10+b[i]*10;
		}
		result=num+num1;
		result = result/10;
		int m=(n>n1)?n:n1;
		long c[] = new long[50];
		for(i=0;i<50;i++){
			ans=result%10;
			c[i]=ans;
			result=result/10;
			count++;
			if(result==0)
				break;
		}
		for(i=count-1;i>=0;i--){
			System.out.print(c[i]+" ");
		}
	}
}







