import java.util.Scanner;
public class LoginModule{
	public static void main(String[] args){
		
		home();

	}
	public static void home(){
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------Home---------------");
		System.out.println("\nAdmin");
		System.out.println("\nUser\n");
		

		String s = scan.next();
		
		switch(s){
		case "Admin":
			admin();
			break;
		case "User":
			user();
			break;
		default:
			System.out.println("Invalid input!!!");
			break;	
		}
	}
	public static void admin(){
		System.out.println("***********Admin Page**************");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nsignup \t signin\n");
		String adminname="admin",adminpwd="password";
		String str=scan.next();
		switch(str){
		case "signup":
			signup(adminname,adminpwd);
			break;
		case "signin":
			signin(adminname, adminpwd);
			break;
		default:
			System.out.println("Invalid input!!!");
			break;	
		}
	}
	public static void user(){
		System.out.println("***********User Page**************");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nsignup \t signin\n");
		String username="user",userpwd="password";
		String str=scan.next();
		switch(str){
		case "signup":
			signup(username,userpwd);
			break;
		case "signin":
			signin(username, userpwd);
			break;
		default:
			System.out.println("Invalid input!!!");
			break;	
		}
	}
	
	public static void signup(String name, String pass){
		System.out.println("\n***********Signup Page**************");
		Scanner scan = new Scanner(System.in);
		System.out.println("User Name : ");
		name=scan.nextLine();
		System.out.println("Note:minimum 1 small letter, 1 capital letter, 1 special character and 1 number");
		
		int n=0;
		while(n==0){
			System.out.println("\nPassword :");
			pass = scan.next();
			n=validator(pass);
			
			
		}
		
		System.out.println("\n*************************");
		System.out.println("\nsignup\tsignin\n");
		String x = scan.next();
		switch(x){
			case "signup":
				signup(name,pass);
				break;
			case "signin":	
				signin(name,pass);
				break;
			default:
				System.out.println("Invalid input!!!");
				break;	
		}
				
	}
	public static void signin(String name, String pass){
		System.out.println("\n***********Signin Page**************\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("User Name :");
		String a = scan.nextLine();
		if(a.equals(name)){
			System.out.println("Password : ");
			String b = scan.next();
			if(b.equals(pass)){
				System.out.println("Welcome "+a);
			}
			else {
				System.out.println("Password is Wrong");
				signin(name,pass);
			}
					
		}
		else{
			System.out.println("User name is wrong");
			signin(name,pass);
		}
	}
	public static int validator(String p){
   		int special=0,number=0,lower=0,upper=0;
 		char a[]=p.toCharArray();
            	if(a.length>=8){
       			for(int i=0;i<a.length;i++){
    				 if(a[i]>=35 && a[i]<=46 || a[i]==64)
				 	special++;
     				 else if(a[i]>=48 && a[i]<=57)
					number++;
     			 	 else if(a[i]>=65 && a[i]<=90)
					upper++;
    				 else if(a[i]>=97 && a[i]<=122)
					lower++;
		        }
		}
    		else{
      			System.out.println("Password Must be minimum 8 characters");
         		return 0;	
                 }
                   
		if(special>=1 && number>=1 && upper>=1 && lower>=1){
			return 1;
     		}
		else{
			System.out.println("Note:minimum 1 small letter, 1 capital letter, 1 special character and 1 number");
			return 0;
		}
	}
	
	
	
}