package QuestionBank3_IfElse_Nested_IfElse;

import java.util.Scanner;

public class Login_Authentication2 {
//incomplete
	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				String username="Komal";
				String password="Artsdf@123$";
				
				
				System.out.println("Enter username : ");
				
				String correct_username = sc.nextLine();
				
				System.out.println("Enter password : ");
				String correct_password = sc.nextLine();
				
				/*if validate with if-else: use an if-else statement to compare the entered username and password with predefined values.remember to use equals() for string comparison not == operator.*/
				
				if(username.equals(correct_username) && password.equals(correct_password) ){
					System.out.println("Access Granted!!!");
				}
				else {
					System.out.println("Denied!!!");
					}
					if(!username.equals(correct_username)){
				
					System.out.println("invalid username");
				}
				else {
					if(!password.equals(correct_password)){
				
					System.out.println("invalid password");
					}
	             
              }
	        }
           } 
