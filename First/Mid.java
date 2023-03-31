import java.util.Scanner;
public class Mid{
	public static void main(String[] args){
		int i,space,j,k;
		char temp;
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		char[] ch = s.toCharArray();
		int mid =(s.length()+1)/2;
		mid=mid-1;
		int a = mid+1;
		int len = s.length();
		for(i=0;i<len-1;i++){
			for(j=0;j<len-i-1;j++){
				if(mid<len){
					temp=ch[j];
					ch[j]=ch[mid];
					ch[mid]=temp;
					mid++;
				}
				
			}
		}
		int b = len-a;
		char c[] = new char[b];
		c[0]=ch[len-1];
		for(i=1,j=a;j<len-1;i++,j++){
			c[i]=ch[j];
		}
		
		for(i=0;i<len;i++){
			for(space=len*2-2-i*2;space>0;space--){
				System.out.print(" ");
			}
			
			for(j=0,k=0;j<=i;j++){
				if(j<a){
					System.out.print(ch[j]);
				}
				else{
					System.out.print(c[k]);	
					k++;
				}
			}
			
			
			System.out.println();
		}
	}
}