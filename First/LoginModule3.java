import java.util.Scanner;
public class LoginModule3{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Admin");
		System.out.println("User\n");
		int i=0;
		int j=0;
		String adminname;
		String adminpwd;
		String s = scan.next();
		
		switch(s){
		case "Admin":
			System.out.println("\nsignup \t signin");
			String str=scan.next();
			switch(str){
			case "signup":
				System.out.println("User Name : ");
				adminname=scan.next();		
				System.out.println("\nPassword :");
				adminpwd=scan.next();
					
				break;
			case "signin":
				System.out.println("User Name :");
				String a = scan.next();
				
					if(adminname.equals(a)){
						System.out.println("Password : ");
						String b=scan.next();
					}
				
				
			}
		default:
			System.out.println("Bye");
			break;	
		}
	}


}