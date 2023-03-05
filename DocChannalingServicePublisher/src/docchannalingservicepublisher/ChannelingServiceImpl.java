package docchannalingservicepublisher;

import java.util.Random;
import java.util.Scanner;

public class ChannelingServiceImpl implements ChannelingService {

	@Override
	public void ChannelingService() {
		Scanner scanner = new Scanner(System.in);



		int channelling = 2;
		while (channelling == 2) {
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t    *****************Welcome to the MediCare Channeling Center******************");
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t    =========================================================================================================");
			System.out.println("\t\t    	Specialist Doctor Name		            " +        "Price");
			System.out.println("\t\t    =========================================================================================================");
			
			
			System.out.println("\t\t    1. Dr. (Mrs) Rohini Tennakoon                   2500            " + "MBBS, MD,MRCP(UK)");
			System.out.println("\t\t\t\t\t\t\t\t\t\t    Consultant Cardiologist");    
			System.out.println("\t\t\t\t\t\t\t\t\t\t    The National Hospital, Kandy"); 
			System.out.println("");
			
			
			System.out.println("\t\t    2. Dr. (Mrs) Subhashini Jayawickreme	    3000            " +  "MBBS, MD, MRCP-UK, PRCP-E");
			System.out.println("\t\t\t\t\t\t\t\t\t\t    Consultant Cardiac Elecrophysiologist");    
			System.out.println("\t\t\t\t\t\t\t\t\t\t    The National Hospital, Kandy"); 
			System.out.println("");
			
			
			System.out.println("\t\t    3. Dr. Rasitha Manathunga	                    2000            " + "MBBS, MS(SL), MRCS(Eng)");
			System.out.println("\t\t\t\t\t\t\t\t\t\t    Consultant Oncological Surgeon");    
			System.out.println("\t\t\t\t\t\t\t\t\t\t    The National Hospital, Kandy"); 
			System.out.println("");
			
			
			System.out.println("\t\t    4. Dr. Prabha Samarakoon	                    4000            " + "MBBS,DO,MS(Ophth),FRCS(Edin)");
			System.out.println("\t\t\t\t\t\t\t\t\t\t    Consultant Ophthalmologist");    
			System.out.println("\t\t\t\t\t\t\t\t\t\t    The National Hospital, Kandy"); 
			System.out.println("");
			
			
			System.out.println("\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    =========================================================================================================");
			System.out.println("");
			System.out.println("");




			System.out.printf("Please Choose The Physician You Wish To See :-  ");
			System.out.println();

			int op = scanner.nextInt();

			if (op == 1 || op == 2 || op == 3 || op == 4) {
				
				System.out.print("Please Enter Your Name          : ");
				String name = scanner.next();
				
				System.out.print("Please Enter Your Address       : ");
				String address = scanner.next();
				
				System.out.print("Please Enter Your Phone Number  : ");
				int phone = scanner.nextInt();
				
				System.out.print("Pick a Date In This Month       : ");
				String date = scanner.next();
				
				


				

				System.out.println();
				System.out.println();
				System.out.println();


				Random rd = new Random();
				int No = rd.nextInt(100);

//				System.out.println("Please confirm that you wish to make this reservation [1 = Yes  |  2 = No ]");
//				int res = scanner.nextInt();


					if (op == 1) {
						int serviceCharge = 500;
						double amount = (2500 + serviceCharge) ;
						System.out.println("\t\t\t===================================== Your Reservation Details ===============================");
						System.out.println();
						System.out.println("\t\t\t\t\t\t Reservation No \t\t: " + No);
						System.out.println("\t\t\t\t\t\t Reservation Date \t\t: " + date);
						System.out.println("\t\t\t\t\t\t Name of the Specialist \t: " + "Dr. (Mrs) Rohini Tennakoon");
						System.out.println("\t\t\t\t\t\t Patient's Name \t\t: " + name);	
						System.out.println("\t\t\t\t\t\t Patient's Address \t\t: " + address);
						System.out.println("\t\t\t\t\t\t Patient's phone number \t: " + phone);
						System.out.println("");
						System.out.println("\t\t\t====================================== Payment Details ======================================");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t Channeling Fees\t\t: " + "2500");
						System.out.println("\t\t\t\t\t\t Service Charges\t\t: " + serviceCharge);
						System.out.println("\t\t\t\t\t\t Total Amount\t\t\t: " + amount);
						System.out.println("");
						System.out.println("");
						System.out.println("\t\t\t==============================================================================================");
						System.out.println("");

					} else if (op == 2) {
						int serviceCharge = 500;
						double amount = (3000 + serviceCharge) ;
						System.out.println("\t\t\t===================================== Your Reservation =====================================");
						System.out.println();
						System.out.println("\t\t\t\t\t\t Reservation No \t\t: " + No);
						System.out.println("\t\t\t\t\t\t Reservation Date \t\t: " + date);
						System.out.println("\t\t\t\t\t\t Name of the Specialist \t: " + "Dr. (Mrs) Subhashini Jayawickreme");
						System.out.println("\t\t\t\t\t\t Patient's Name \t\t: " + name);	
						System.out.println("\t\t\t\t\t\t Patient's Address \t\t: " + address);
						System.out.println("\t\t\t\t\t\t Patient's phone number \t: " + phone);
						System.out.println("");
						System.out.println("\t\t\t====================================== Payment Details ======================================");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t Channeling Fees\t\t: " + "3000");
						System.out.println("\t\t\t\t\t\t Service Charges\t\t: " + serviceCharge);
						System.out.println("\t\t\t\t\t\t Total Amount\t\t\t: " + amount);
						System.out.println("");
						System.out.println("\t\t\t==============================================================================================");
						System.out.println("");

					} else if(op == 3){
						int serviceCharge = 500;
						double amount = (2000 + serviceCharge) ;
						System.out.println("\t\t\t===================================== Your Reservation =====================================");
						System.out.println();
						System.out.println("\t\t\t\t\t\t Reservation No \t\t: " + No);
						System.out.println("\t\t\t\t\t\t Reservation Date \t\t: " + date);
						System.out.println("\t\t\t\t\t\t Name of the Specialist \t: " + "Dr. Rasitha Manathunga");
						System.out.println("\t\t\t\t\t\t Patient's Name \t\t: " + name);	
						System.out.println("\t\t\t\t\t\t Patient's Address \t\t: " + address);
						System.out.println("\t\t\t\t\t\t Patient's phone number \t: " + phone);
						System.out.println("");
						System.out.println("\t\t\t====================================== Payment Details ======================================");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t Channeling Fees\t\t: " + "2000");
						System.out.println("\t\t\t\t\t\t Service Charges\t\t: " + serviceCharge);
						System.out.println("\t\t\t\t\t\t Total Amount\t\t\t: " + amount);
						System.out.println("");
						System.out.println("");
						System.out.println("\t\t\t==============================================================================================");
						System.out.println("");

					} else if(op == 4){
						int serviceCharge = 500;
						double amount = (4000 + serviceCharge) ;
						System.out.println("\t\t\t===================================== Your Reservation =====================================");
						System.out.println();
						System.out.println("\t\t\t\t\t\t Reservation No \t\t: " + No);
						System.out.println("\t\t\t\t\t\t Reservation Date \t\t: " + date);
						System.out.println("\t\t\t\t\t\t Name of the Specialist \t: " + "Dr. Prabha Samarakoon");
						System.out.println("\t\t\t\t\t\t Patient's Name \t\t: " + name);	
						System.out.println("\t\t\t\t\t\t Patient's Address \t\t: " + address);
						System.out.println("\t\t\t\t\t\t Patient's phone number \t: " + phone);
						System.out.println("");
						System.out.println("\t\t\t====================================== Payment Details ======================================");
						System.out.println("");
						System.out.println("\t\t\t\t\t\t Channeling Fees\t\t: " + "4000");
						System.out.println("\t\t\t\t\t\t Service Charges\t\t: " + serviceCharge);
						System.out.println("\t\t\t\t\t\t Total Amount\t\t\t: " + amount);
						System.out.println("");
						System.out.println("");
						System.out.println("\t\t\t==============================================================================================");
						System.out.println("");

					} else {
						System.out.println("Unavailable channelling");
					
					}					

					System.out.println("Do You Want To Confirm This Reservation ? [Yes = 1 | No = 2]");
					channelling = scanner.nextInt();

					if (channelling == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
					}

				 

			} else if (op == 0) {

				System.out.println("");
				System.out.println("Thank You!!!...");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.print("Sorry, Invalid Operation No. Do you want to continue.?  [Yes = 1 | No = 2] :");
				channelling = scanner.nextInt();

				if (channelling == 2) {
					System.out.println("");
					System.out.println("Thank You!!!...");
					System.out.println();
				}

			}

			while (channelling != 1 && channelling != 2) {
				System.out.println("");
				System.out.println("Sorry, Invalid Operation No.");
				System.out.println("Type 1 = Continue Ordering / Type 2 = Exit  ");
				channelling = scanner.nextInt();

				if (channelling == 2) {
					System.out.println();
					System.out.println("Thank You!!!...");
					System.out.println();
				}
			}

		}
		
	}

}
