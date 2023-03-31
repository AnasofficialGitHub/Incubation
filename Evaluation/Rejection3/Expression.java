import java.util.Scanner;
public class Expression{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=scan.nextInt();
		System.out.println("Enter the expression");
		String s[] = new String[n];
		int arr[] = new int[n];
		int i,j,k,ans;
		for(i=0;i<n;i++)
			s[i]=scan.next();
		for(i=0;i<n;i++){
			char c[]=s[i].toCharArray();
			ans=c[0]-48;
			for(j=1;j<c.length;j++){
				if(c[j]==37){
					k=c[j+1]-48;
					ans=ans%k;
					j++;
				}
				else if(c[j]=='*'){
					k=c[j+1]-48;
					ans=ans*k;
					j++;
				}
				else if(c[j]=='/'){
					k=c[j+1]-48;
					ans=ans/k;
					j++;
				}
				else if(c[j]=='+'){
					k=c[j+1]-48;
					ans=ans+k;
					j++;
				}
				else if(c[j]=='-'){
					k=c[j+1]-48;
					ans=ans-k;
					j++;
				}
				else if(c[j]=='^'){
					k=c[j+1]-48;
					ans=power(ans,k);
					j++;
				}
				else{
					k=c[j]-48;
					ans=ans*10+k;
				}	
			}
			arr[i]=ans;
		}	
		int temp;
		String temp1;
		for(i=0;i<n-1;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					temp1=s[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					s[j]=s[j+1];
					s[j+1]=temp1;
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(s[i]+" = "+arr[i]);
					
				
	}
	static int power(int a ,int p){
		int temp = a;
		for(int i=1;i<p;i++){
			a*=temp;
		}
		return a;
	}
}