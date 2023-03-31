import java.util.Scanner;
public class Primepair{
	public static void main(String[] args){
		int j, flag,flag1;
		for(j=3;j<100;j++){
			flag = prime(j);
			flag1 = prime(j+2);
			if(flag==0 && flag1==0)
				System.out.println("("+j+","+(j+2)+")");
		}
		
	}
	public static int prime(int n){
		int flag=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag = 1;
				break;
			}
		}
		return flag;
	}
}