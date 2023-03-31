import java.util.Scanner;
public class NumStar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		int k=1,c=0;
		String temp="";
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(j!=0){
					temp+="*"+k;
					System.out.print("*"+k++);
				}
				else{
					temp+=k;
					System.out.print(k++);
				}
			}
			System.out.println();
			arr[c++]=temp;
			temp="";	
		}
		for(int i=arr.length-1;i>=0;i--)
			System.out.println(arr[i]);
	}
}