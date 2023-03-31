import java.util.Scanner;
public class Stock{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		System.out.print(maxProfit(arr,0,n-1));
	}
	public static int maxProfit(int price[],int i, int n){
 		if (n <= i)
        		return 0;
		int profit = 0;
  		for (int j=i;j<n;j++){
        		for (int k=j+1;k<=n;k++){
            			if (price[k] > price[j]){
                			int cp = price[k] - price[j] + maxProfit(price,i,j-1) +maxProfit(price,k+1,n);
                			if(profit<cp)
						profit = cp;
            			}
        		}
    		}
    		return profit;
	}
}