import java.util.Scanner;
public class LoginModule1{
	public static void main(String[] args){
		
		
		int i=0;
		int j=0;
		String[] adminname = new String[50]; 
		String[] adminpwd = new String[50];
		home(i,j,adminname,adminpwd);
		
		
	}
	public static void home(int i,int j, String[] adminname, String[] adminpwd){
		Scanner scan = new Scanner(System.in);
		System.out.println("Admin");
		System.out.println("User\n");
		String s = scan.next();
		switch(s){
		case "Admin":
			System.out.println("\nsignup \t signin");
			String str=scan.next();
			switch(str){
			case "signup":
				
				System.out.println("User Name : ");
				for(;i<50;){
					adminname[i]=scan.next();
					i++;
					if(i<50)
						break;
				}		
				System.out.println("\nPassword :");
				for(;j<50;){
					adminpwd[j]=scan.next();
					j++;
					if(j<50){
						System.out.println("Signup successfull");
						home(i,j,adminname,adminpwd);
					}
					
				}
			case "signin":
				System.out.println("User Name :");
				String a = scan.next();
				for(int k=0;k<50;k++){
					if(a==adminname[k]){
						System.out.println("Password : ");
						home(i,j,adminname,adminpwd);
					}
				}
				
			}
		default:
			System.out.println("Bye");
			break;	
		}
	}


}