public class Sample1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence to reverse the String");
		String s = scan.next();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='.')