package inquiryservicepublisher;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InquiryServicePublishImpl implements InquiryService {
	
	public void InquiryServicePublish() {
		
		Scanner sc = new Scanner(System.in);
		
		String CustomerName;
		String subject;
		String email;
		String inquiry;
		String rate;
		String question;
		String test; 
		int Services;
		
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		int selection = 1;
		while (selection == 1) {

		
		System.out.println("------------------------ WELCOME TO INQUIRY SERVICE -------------------------");
		System.out.println();
		
		System.out.print("Please Enter Your Name: ");
		String Name = sc.nextLine();
		System.out.println();
		
		System.out.println("Welcome : "+ Name);
		System.out.println();
		System.out.println();
		
		System.out.println("---------------------- PLEASE FOLLOW THE PROVIDED STEPS ---------------------");
		System.out.println();
		
		
		System.out.println(" TYPES OF OUR SERVICES");
		System.out.println();
/*		System.out.println("	1 - Ask A Questions		");    
		System.out.println("	1 - 📞 Contact Us		");
		System.out.println("	2 - ✍️ Submit Inquiry   ");    */
		System.out.println("	1 - ☎ Ask A Questions  ");
		System.out.println("	2 - 📝 Submit Inquiry   ");
		System.out.println();
		
		System.out.print("Please Select Your Option [1 | 2] : ");
		int type = sc.nextInt();
		System.out.println();
		
		if (type == 1 || type == 2)
		{
			if (type == 2)
			{
				System.out.print("");
				test = sc.nextLine();
				System.out.println();
				
				System.out.print(" Full Name : ");
				CustomerName = sc.nextLine();
				System.out.println();
				
				System.out.print(" Email     : ");
				email = sc.nextLine();
				System.out.println();
				
				System.out.print(" Subject   : ");
				subject = sc.nextLine();
				System.out.println();
				
				System.out.print(" Message   : ");
				inquiry = sc.nextLine();
				System.out.println();
			
				System.out.print(" Rate Your Satisfaction Scale With [1 ☹-10 😀]: ");
				rate = sc.nextLine();
				System.out.println();
				System.out.println();
				
				
	        System.out.println("\t\t\t\t\t\t                Inquiry Submitted Successfully     ");
				System.out.println("\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t           Name    : "+ CustomerName);
				System.out.println("\t\t\t\t\t\t\t           Email   : " + email);
				System.out.println("\t\t\t\t\t\t\t           Subject : " + subject);
				System.out.println("\t\t\t\t\t\t\t           Message : " + inquiry );
				System.out.println("\t\t\t\t\t\t\t        "+dft.format(now));
				System.out.println("");
				System.out.println("\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				System.out.println("");
				System.out.println("");
				System.out.println("THANK YOU FOR YOUR SUBMISSION ! ");
				System.out.println();
				return;
			}
			
			
			
			else if (type == 1)
			{
				System.out.print("");
				test = sc.nextLine();
				System.out.println();
				
				System.out.print(" Full Name : ");
				CustomerName = sc.nextLine();
				System.out.println();
				
				System.out.print(" Email     : ");
				email = sc.nextLine();
				System.out.println("");
										
				System.out.print(" Reson for Contacting(Subject) : ");
				subject = sc.nextLine();
				System.out.println();
				
				System.out.print(" Type Your Message : ");
				question = sc.nextLine();
				System.out.println("");
				System.out.println("");
					        
		        System.out.println("\t\t\t\t\t\t         Submitted Successfully     ");
				System.out.println("\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("");
				System.out.println("\t\t\t\t\t\t\t   Name    : "+ CustomerName);
				System.out.println("\t\t\t\t\t\t\t   Email   : " + email);
				System.out.println("\t\t\t\t\t\t\t   Subject : " + subject);
				System.out.println("\t\t\t\t\t\t\t   Message : " + question);
				System.out.println("\t\t\t\t\t\t\t "+dft.format(now));
				System.out.println("");
				System.out.println("\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
				System.out.println("");
				System.out.println("THANK YOU FOR CONTACTING US !");
				System.out.println();
				return;
			}
			
			else 
			{
				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue ? [1-YES | 2-NO ]: ");
				type = sc.nextInt();
				
				if (type == 2) {
					System.out.println("");
					System.out.println("THANK YOU");
					System.out.println();
				}
			}
							
			}
		}
	}
}


