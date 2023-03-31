import java.util.Scanner;
public class Anagram{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int n=scan.nextInt();
		int i,j,k,l=0,count,flag,m;
		String[] s = new String[n];
		System.out.println("enter the words");
		for(i=0;i<n;i++)
			s[i]=scan.next();
		System.out.println("Word : ");
		String str = scan.next();
		int arr[] = new int[str.length()];
		for(i=0;i<n;i++){
			count=0;
			l=0;
			if(str.length()==s[i].length()){
				for(j=0;j<str.length();j++){
					for(k=0;k<str.length();k++){
						if(str.charAt(j)==s[i].charAt(k)){
							flag=0;
							for(m=0;m<l;m++){
								if(arr[m]==k){
									flag=1;
									break;
								}
							}
							if(flag==0){
								arr[l]=k;
								l++;
								count++;
								break;
							}
						}
					}
				}
			}
			if(count==str.length())
				System.out.println(s[i]+" ");
		}
	}
}
				