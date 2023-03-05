package laboratorypublisher;

import java.util.Random;
import java.util.Scanner;

public class LaboratoryTestImpl implements LaboratoryTest{
	
	@Override
	public void  LaboratoryTest(){
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("--------------------------- Welcome to Laboratory Service ---------------------------");
		System.out.println("=====================================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print("Enter Your Name : ");
		String Yname = scanner.next();

		System.out.println("=====================================================================================");
		System.out.println(" \t\t\t\t WELCOME !! " + Yname);
		System.out.println("=====================================================================================");
		
		int choice = 1;
		
		while (choice == 1) {
			
			
			System.out.print("Do you reserved your Booking Number? [1 = Yes || 2 = No]: ");
			int ord = scanner.nextInt();
			System.out.println("");
			

			double totlabPrice = 0;
			double totPrice = 0;
			

			Random random = new Random();
			int test_Number = random.nextInt(50);
			int booking_Number = random.nextInt(50);

			
			if (ord == 1) {

				int choice1 = 1;

				while (choice1 == 1) {
					
					
					System.out.print("Please Enter the Booking Number :  ");
					String bookingNumber = scanner.next();

					System.out.print("Please Enter Your Age :  ");
					double age = scanner.nextDouble();
					
					System.out.print("Please Enter Your Address: ");
					String address = scanner.next();
					
					System.out.println("");
					System.out.println("");
					
					if (age >= 1 && age <= 100) {
						
						double booking_charges = 250;
						totPrice = booking_charges;
						
						System.out.println("Booking Number \t: " + bookingNumber);
						System.out.println("Address \t: " + address);
						System.out.println("Age \t\t: " + age + " Years ");
						System.out.println("Booking Fee \t: " + totPrice);
						
						System.out.println("");
						
						/////
						
						if (age > 1 && age <= 100) {
							
							

							System.out.println("//////////////////////   List of Tests  ////////////////////");
							System.out.println("");
							System.out.println("	Name of The Test 		" + "price");
							
							System.out.println("____________________________________________________________");
							
							System.out.println("1. Urine Test	\t\t\t" + "2000");
							System.out.println("2. Blood Test	\t\t	" + "1500");
							System.out.println("3. ECG            \t\t\t" + "600");
							System.out.println("4. Kidney Test \t\t\t\t"+ "800");
							System.out.println("0. Exit");
							System.out.println("");

							System.out.println("Please Enter Name of the Test [1|2|3|4|0]:  ");
							
							int alt = scanner.nextInt();

							if (alt == 1 || alt == 2 || alt == 3||alt==4) {

								System.out.println("Please Enter The Amount of Test(s) Needed ?");
								double count = scanner.nextDouble();
								System.out.println("");

								if (alt == 1) {
									
									totlabPrice = ( 2000 * count );
									System.out.println("Test Number \t\t: " + test_Number);
									System.out.println("Booking Number \t\t: " + bookingNumber);
									System.out.println("Name of the Test \t: " + "Urine Test");
									System.out.println("Address \t\t: " + address);
									System.out.println("age \t\t\t: " + age + " Years");
									System.out.println("Total Price \t\t: " + (totlabPrice + booking_charges));

								} else if (alt == 2) {
									
									totlabPrice = (1500 * count);
									System.out.println("Test Number \t\t: " + test_Number);
									System.out.println("Booking Number \t\t: " + booking_Number);
									System.out.println("Name of the Test \t: " + "Blood Test");
									System.out.println("Address \t\t: " + address);
									System.out.println("age \t\t\t: " + age + " Years");
									System.out.println("Total Price \t\t: " + (totlabPrice + booking_charges));
									
								}else if (alt== 3) {
									
									totlabPrice = (600 * count);
									System.out.println("Test Number \t\t: " + test_Number);
									System.out.println("Booking Number \t\t: " + bookingNumber);
									System.out.println("Name of the Test \t: " + "ECG");
									System.out.println("Address \t\t: " + address);
									System.out.println("age \t\t\t: " + age + " Years");
									System.out.println("Total Price \t\t: " + (totlabPrice + booking_charges));
									
									

								} else {
									
									totlabPrice = (800 * count);
									System.out.println("Test Number \t\t: " + test_Number);
									System.out.println("Booking Number \t\t: " + bookingNumber);
									System.out.println("Name of the Test \t: " + "Kidney Test");
									System.out.println("Address \t\t: " + address);
									System.out.println("age \t\t\t: " + age + " Years");
									System.out.println("Total Price \t\t: " + (totlabPrice + booking_charges));

								}
								
								System.out.println("");
								System.out.println("Please Press 1 to confirm the booking:");

								int choice5 = scanner.nextInt();

								if (choice5 != 1) {
									
									System.out.println("");
									System.out.println("Invalid Input!");
									choice5 = scanner.nextInt();
									}

									else {
										
										System.out.println("");
										System.out.println("=================================== Thank You ===================================");
										System.out.println("");
										
									}
										
									
								}

						
						if (choice == 2) {
							
							System.out.println("");
							System.out.println("===================================== Thank You====================================");
							System.out.println();
						}
						
						break;
								}
							}

					 else {
						
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
			}

			 else if (ord == 2) {
				

				int choice2 = 1;
				
				while (choice2 == 1) {
					

					System.out.println("");
					System.out.println("***************************** ONLINE LABORATORY SERVICE *****************************");
					System.out.println("");

			
					System.out.println("Please Enter Your age [Years]: ");
					double age1 = scanner.nextDouble();
					System.out.println(""); 
					
					System.out.println("Please Enter Your Address: ");
					System.out.println(" ");
					String address1 = scanner.next();
					
					
					if (age1 > 1 && age1 <= 100) {
						
						

						System.out.println("//////////////////////   List of Tests  ////////////////////");
						System.out.println("");
						System.out.println("	Name of The Test 		" + "price");
						
						System.out.println("____________________________________________________________");
						
						System.out.println("1. Urine Test	\t\t\t" + "2000");
						System.out.println("2. Blood Test	\t\t	" + "1500");
						System.out.println("3. ECG            \t\t\t" + "600");
						System.out.println("4.Kidney Test \t\t\t\t"+ "800");
						System.out.println("0. Exit");
						System.out.println("");

						System.out.println("Please Enter Name of the Test [1|2|3|4|0]:  ");
						
						int alt = scanner.nextInt();

						if (alt == 1 || alt == 2 || alt == 3||alt==4) {

							System.out.println("Please Enter The Amount of Test(s) Needed ?");
							double count = scanner.nextDouble();
							System.out.println("");

							if (alt == 1) {
								
								totlabPrice = ( 2000 * count );
								System.out.println("Test Number \t\t: " + test_Number);
								System.out.println("Booking Number \t\t\t: " + booking_Number);
								System.out.println("Name of the Test \t: " + "Urine Test");
								System.out.println("Price in Rs[LKR] \t: " + count);
								System.out.println("Address \t\t: " + address1);
								System.out.println("age \t\t: " + age1 + " Years");
								System.out.println("Total Price \t\t: " + totlabPrice);

							} else if (alt == 2) {
								
								totlabPrice = (1500 * count);
								System.out.println("Test Number \t\t: " + test_Number);
								System.out.println("Booking Number \t\t\t: " + booking_Number);
								System.out.println("Name of the Test \t: " + "Blood Test");
								System.out.println("Price in Rs[LKR] \t: " + count);
								System.out.println("Address \t\t: " + address1);
								System.out.println("age \t\t: " + age1 + " Years");
								System.out.println("Total Price \t\t: " + totlabPrice);
								
							}else if (alt== 3) {
								
								totlabPrice = (600 * count);
								System.out.println("Test Number \t\t: " + test_Number);
								System.out.println("Booking Number \t: " + booking_Number);
								System.out.println("Name of the Test \t: " + "ECG");
								System.out.println("Price in Rs[LKR] \t: " + count);
								System.out.println("Address \t\t: " + address1);
								System.out.println("age \t\t: " + age1 + " Years");
								System.out.println("Total Price \t\t: " + totlabPrice);
								
								

							} else {
								
								totlabPrice = (800 * count);
								System.out.println("Test Number \t\t: " + test_Number);
								System.out.println("Booking Number \t: " + booking_Number);
								System.out.println("Name of the Test \t: " + "Kidney Test");
								System.out.println("Price in [LKR] \t: " + count);
								System.out.println("Address \t\t: " + address1);
								System.out.println("age \t\t\t: " + age1 + " Years");
								System.out.println("Total Price \t\t: " + totlabPrice);

							}

							if (age1 >= 1) {
								
								double booking_charges = 250;
								totPrice = totlabPrice + booking_charges;
								System.out.println("Booking Fee [Rs] \t: " + booking_charges);
							}
							

							System.out.println("Total Amount [Rs] \t: " + totPrice);
							System.out.println("");

							System.out.println("Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
							choice = scanner.nextInt();
							

							if (choice == 2) {
								
								System.out.println("");
								System.out.println("=================================== Thank You ===================================");
								System.out.println();
							}
							
							break;
							
						} else if (alt == 0) {
							
							System.out.println("");
							System.out.println("=================================== Thank You ===================================");
							System.out.println();
							return;

						} else {
							
							System.out.println("");
							System.out.println("Invalid Input.! .! !  | Do you want to keep going ? [Type 1 = Yes | Type 2 = No] : ");
							choice2 = scanner.nextInt();

							if (choice2 == 2) {
								System.out.println("");
								System.out.println("=================================== Thank You ===================================");
								System.out.println();
							}
						}

					} else {
						
						System.out.println("Do you want to keep going ? [Type 1 = Yes || Type 2 = No] : ");
						choice2 = scanner.nextInt();

						if (choice2 == 2) {
							
							System.out.println("");
							System.out.println("=================================== Thank You ===================================");
							System.out.println("");
							return;
						}
					}

				}

			} else {
				
				System.out.println("");
				System.out.println("Invalid Input!! | Do you want to keep going  ? [Type 1 = Yes || Type 2 = No] : ");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("=================================== Thank You ===================================");
					System.out.println("");
				}

			}

			while (choice != 1 && choice != 2) {
				
				System.out.println("");
				System.out.println("Invalid Input!");
				choice = scanner.nextInt();

				if (choice == 2) {
					
					System.out.println("");
					System.out.println("=================================== Thank You ===================================");
					System.out.println("");
				}
			}
		}
			}



	}


	
	





