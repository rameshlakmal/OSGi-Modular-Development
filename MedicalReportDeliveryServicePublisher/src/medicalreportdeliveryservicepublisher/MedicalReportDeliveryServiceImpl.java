package medicalreportdeliveryservicepublisher;

import java.util.Random;
import java.util.Scanner;

public class MedicalReportDeliveryServiceImpl implements MedicalReportDeliveryService{
	
	@Override
	public void publishService() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * *  Thank you for visiting our  MEDICLINIC * * * * * * * *");
		System.out.println("");
		System.out.println("* * * * * * * *  Welcome to MEDICLINIC Delivery Service  * * * * * * * * ");
		System.out.println("");
		System.out.print("Please Give Your Name : ");
		String Yname = scanner.next();

		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  * * * ");
		System.out.println(" ");
		System.out.println(" WELCOME !! " + Yname);
		System.out.println("");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		int choice = 1;
		
		while (choice == 1) {
			
			System.out.println("");
			System.out.println("**** *** ** *  MEDICLINIC DELIVERY SERVICE *  ** *** ****");
			System.out.println("");
			

			System.out.print("Do you have a  Report number ? [1 = Yes || 2 = No]: ");
			int ord = scanner.nextInt();
			System.out.println("");
			

			double totDeliveryPrice = 0;
			double totPrice = 0;
			

			Random random = new Random();
			int delivery_Number = random.nextInt(1000);
			int Report_Number = random.nextInt(1000);
			int price = random.nextInt(1000);

			String Names  [] = {"X-RAY", "Blood", "Yuria","ECG"};
			String Name = (Names[new Random().nextInt(Names.length)]);
			
			if (ord == 1) {

				int choice1 = 1;

				while (choice1 == 1) {

					System.out.print("Please Enter the report Number :  ");
					String orderNumber = scanner.next();

					
					System.out.print("Please Enter the  Distance in Kilometers :  ");
					double dist = scanner.nextDouble();
					System.out.println("");
					
					
					System.out.print("Please Enter Your Address: ");
					String address = scanner.next();
					
					System.out.print("Please Enter Your Phone Number: ");
					String phoneNumber = scanner.next();
					
					
					if (dist >= 1 && dist <= 20) {
						
						double delivery_charges = 100;
						delivery_charges = delivery_charges + ((dist-1) * delivery_charges);
						totPrice = delivery_charges;
						
						
						System.out.println("Order Number \t: " + Report_Number);
						System.out.println("Delivery Number\t: " + delivery_Number);
						System.out.println("Address \t: " + address);
						System.out.println("Phone Number \t: " +phoneNumber );
						System.out.println("Distance in Kilometers \t: " + dist + " KM ");
						System.out.println("Delivery Price \t: " + totPrice);
						
						System.out.println("");
						System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
						choice= scanner.nextInt();

						if (choice == 2) {
							
							System.out.println("");
							System.out.println("* ! * ! * ! * ! * ! * ! * ! Thank You * ! * ! * ! * ! * ! * ! * ! *");
							System.out.println();
						}
						
						break;

					} else {
						
						System.out.println("Oops .... We are really Sorry !!! our coverage is only for  1km to 20km..");
						System.out.println(" ");
						
						System.out.println("Do you want to keep going ? [type 1 = Yes || Type 2 = No] : ");
						choice1 = scanner.nextInt();

						if (choice1 == 2) {
							
							System.out.println("");
							System.out.println("===================================== Thank You====================================");
							System.out.println();
							return;
						}
					}
				}

			} else if (ord == 2) {
				

				int choice2 = 1;
				
				while (choice2 == 1) {
					

					System.out.println("");
					System.out.println("*    * *    * *    * *    * * ONLINE MEDICLINIC  DELIVERY SERVICE * *    * *    * *    * *    *");
					System.out.println("");

			
					System.out.println("Please Enter Your ID Number: ");
					double id = scanner.nextDouble();
					System.out.println("");
					
					System.out.println("Your Report Number is  \t: " + Report_Number);
					
					System.out.println("Your Report Type is  \t:" + Name);
					
					System.out.println("Please Enter Your Address: ");
					System.out.println(" ");
					String address = scanner.next();
					
					System.out.print("Please Enter the  Distance in Kilometers :  ");
					double dist = scanner.nextDouble();
					System.out.println("");
					

					
					
					if (dist >= 1 && dist <= 20) {
						
						double delivery_charges = 100;
						delivery_charges = delivery_charges + ((dist-1) * delivery_charges);
						totPrice = delivery_charges;
						
						
						totDeliveryPrice = ( totPrice+ price   );
						System.out.println("Order Number \t: " + Report_Number);
						System.out.println("Delivery Number\t: " + delivery_Number);
						System.out.println("Name of the Patient \t: " + Yname);
						System.out.println("Report type \t: " + Name);
						System.out.println("ID Number \t: " + id);
						System.out.println("Address \t: " + address);
						System.out.println("Distance in Kilometers \t: " + dist + " KM ");
						System.out.println("Delivery Price \t: " + totPrice);
						System.out.println("Total Price\t: " + totDeliveryPrice);
						


							System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
							choice = scanner.nextInt();
							

							if (choice == 2) {
								
								System.out.println("");
								System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
								System.out.println();
							}
							
							break;
							
					

						} else {
							
							System.out.println("");
							System.out.println("Invalid Input.! .! !  | Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
							choice2 = scanner.nextInt();

							if (choice2 == 2) {
								System.out.println("");
								System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
								System.out.println();
							}
						

					 else {
						
						System.out.println(" Oops..Sorry!! Our coverage is only for  1km to 20km ");
						System.out.println(" ");
						System.out.println("Do you want to keep going ? [Type 1 = Yes || Type 2 = No] : ");
						choice = scanner.nextInt();

						if (choice == 2) {
							
							System.out.println("");
							System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
							System.out.println("");
							return;
						}
					

				

			 else {
				
				System.out.println("");
				System.out.println("Invalid Input!! | Do you want to keep going  ? [Type 1 = Yes || Type 2 = No] : ");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}

			}

			while (choice != 1 && choice != 2) {
				
				System.out.println("");
				System.out.println("Invalid Input!");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * Thank You * * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				}
			}
					 }
						}
	}
			}
}
	}
}



