import java.util.Scanner;
public class Target{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int n = scan.nextInt();
		int i,target,j,k,temp,flag=0,result=0,count=0;
		int a[] = new int[n];
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println("Enter the target");
		target=scan.nextInt();
		for(i=0;i<n;i++){
		for(j=0;j<n;j++){
		for(k=0;k<n;k++){
			if(a[i]+a[j]+a[k]==target){
				result=target;
				flag=1;
				break;
			}
			else if(a[i]+a[j]+a[k]==target+1){
				result=target+1;
				flag=1;
				break;
			}
			else if(a[i]+a[j]+a[k]==target-1){
				result=target-1;
				flag=1;
				break;
			}
		}
		if(flag==1)
			break;
		}
		if(flag==1)
			break;
		}
		Label1:
		for(i=0;i<1;i++)
			System.out.println(result);
	}
}			