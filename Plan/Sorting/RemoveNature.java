import java.util.Scanner;
public class RemoveNature{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n=scan.nextInt();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		int i,j,k;
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the k value :");
		k=scan.nextInt();
		int dub[] = new int[n+k];
		for(i=0;i<dub.length;i++)
			dub[i]=i+1;
		for(i=0;i<n;i++){
			for(j=0;j<dub.length;j++)
				if(arr[i]==dub[j])
					dub[j]=0;
		}
		for(i=0;i<dub.length;i++){
			if(dub[i]==0){
				for(j=i;j<dub.length-1;j++)
					dub[j]=dub[j+1];
			}
		}
		System.out.println("Output : "+dub[k-1]);
	}
}