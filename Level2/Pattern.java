import java.util.Scanner;
public class Pattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the rows");
		int n = scan.nextInt();
		for(i=1;i<=n;i++){
			if(i==1){
				for(j=1;j<i+1;j++){
					System.out.print(j);
				}
			}
			else{
				for(j=1;j<i+1;j++){
					System.out.print("*"+(j+i));
				}
			}
			System.out.println();
		}
	}
}