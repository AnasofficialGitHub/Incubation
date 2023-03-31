import java.util.Scanner;
public class Numbertowords{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		long n=scan.nextLong();
		System.out.println(met(n));
		System.out.println(million(n));
	}
	public static String met(long n){
		String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String tens[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String hund[]=new String[10];
		hund[3]="Hundred";hund[4]="Thousand";hund[5]="Thousand";hund[6]="Lakhs";hund[7]="Lakhs";
		long m=n,count=0,q=0,t=1,r,r1;
		String words="";
		if(m==0)
			words+="zero";
		while(m>0){
			m=m/10;
			count++; 
		}
		m=n;
		for(int i=1;i<count;i++)
			t=t*10;
		if(m>=10000000){
			words+=met(m/10000000)+"crores ";
			m=m%10000000;
			count=7;
			t=1000000;
		}
		while(m>99){
			if(count==3 || count%2==0){
				q=m/t;
				words+=ones[(int)q]+" "+hund[(int)count]+" ";
			}	
			else{
				t=t/10;
				q=m/t;
				if(q<20)
					words+=ones[(int)q]+" "+hund[(int)count]+" ";
				else{
					r=q/10;
					r1=q%10;
					words+=tens[(int)r]+" "+ones[(int)r1]+" "+hund[(int)count]+" ";
				}
				count--;
			}
			m=m%t;
			t=t/10;
			count--;
		}
		if(m<20)
			words+=ones[(int)m]+" ";
		else{
			r=m/10;
			r1=m%10;
			words+=tens[(int)r]+" "+ones[(int)r1]+" ";
		}
		return words;
	}
	public static String million(long n){
		String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String tens[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String hund[]=new String[20];
		hund[3]="Hundred";hund[4]="Thousand";hund[5]="Thousand";hund[6]="Thousands";hund[7]="Million";hund[8]="Million";hund[9]="Million";
		hund[10]="Billion";hund[11]="Billion";hund[12]="Billion";hund[13]="Trillion";hund[14]="Trillion";hund[15]="Trillion";
		long m=n,count=0,q=0,t=1,r,r1;
		String words="";
		if(m==0)
			words+="zero";
		while(m>0){
			m=m/10;
			count++; 
		}
		m=n;
		for(int i=1;i<count;i++)
			t=t*10;
		
		while(m>99){
			if(count==3 || count%2==0){
				q=m/t;
				words+=ones[(int)q]+" "+hund[(int)count]+" ";
			}	
			else{
				t=t/10;
				q=m/t;
				if(q<20)
					words+=ones[(int)q]+" "+hund[(int)count]+" ";
				else if(q<100){
					r=q/10;
					r1=q%10;
					words+=tens[(int)r]+" "+ones[(int)r1]+" "+hund[(int)count]+" ";
				}
				else{
					r=q/10;
					r1=q%10;
					q=q/10;
					r2=q/10;
					words+=ones[(int)r]+" Hundred "+tens[(int)r2]+" "+ones[(int)r1]+" "+hund[(int)count]+" ";
				}
				count--;
			}
			m=m%t;
			t=t/10;
			count--;
		}
		if(m<20)
			words+=ones[(int)m]+" ";
		else{
			r=m/10;
			r1=m%10;
			words+=tens[(int)r]+" "+ones[(int)r1]+" ";
		}
		return words;
	}
}