import java.util.Scanner;
public class NumberInWords{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int  num=sc.nextInt();
		System.out.println(convert(num));
	}
	public static String convert(int num){
		String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
		               "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String tens[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		
	    String words="";
		int q=0;
		int r=0;
        if(num==0)
			return "zero";
	    if(num>99)
		{
			q=num/100;
			num=num%100;
			words+=ones[q]+" hundered ";
		}
	   if(num<20)
		{
			words+=ones[num];
		}
		else if(num<=99)
		{
			q=num/10;
			r=num%10;
			words+=tens[q]+" "+ones[r];
		}
		return words;
		
	}
}