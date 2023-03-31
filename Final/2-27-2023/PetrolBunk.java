import java.util.Scanner;
public class PetrolBunk{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Banks");
		int n=scan.nextInt();
		System.out.println("Enter the petrol in car");
		int p=scan.nextInt();
		System.out.println("Enter the distance of petrolbank");
		int petrol[]=new int[n];
		int dis[]=new int[n];
		for(int i=0;i<n;i++)
			dis[i]=scan.nextInt();
		System.out.println("Enter the petrol in petrolbanks");
		for(int i=0;i<n;i++)
			petrol[i]=scan.nextInt();
		for(int i=1;i<n;i++){
			p+=petrol[i-1];
			p-=dis[i];
			if(p<0){
				System.out.println("Petrol ran out");
				return;
			}
		}
		System.out.println(p);
	}
}