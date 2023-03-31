import java.util.Scanner;
public class LoginModule2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Admin");
		System.out.println("User\n");
		int i=0;
		int j=0;
		String[] adminname = new String[50]; 
		String[] adminpwd = new String[50];
		String s = scan.next();
		
		switch(s){                        //1
		case "Admin":
			System.out.println("\nsignup \t signin");
			String str=scan.next();
			switch(str){              //2
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
						System.out.println("------------------------------------------------------------------------------------");
						System.out.println("Admin \n User");
						s = scan.next();
		
						switch(s){                  //3
						case "Admin":
							System.out.println("\nsignup \t signin");
							str=scan.next();
							switch(str){              //4
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
									if(j<50)
										break;
								}
								break;
							case "signin":
								System.out.println("User Name :");
								String a = scan.next();
								for(int k=0;k<50;k++){
									if(a==adminname[k]){
										System.out.println("Password : ");
										String b = scan.next();
									}
								}
								break;
							}
						}
					}
					
				}
			case "signin":
				System.out.println("User Name :");
				String a = scan.next();
				for(int k=0;k<50;k++){
					if(a==adminname[k]){
						System.out.println("Password : ");
						break;
					}
				}
				break;
				
			}
			break;
		case "User":
			break;
		default:
			System.out.println("Bye");
			break;	
		}
	}


}