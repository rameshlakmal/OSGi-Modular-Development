package inquiryservicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import inquiryservicepublisher.InquiryService;

public class ServiceSubscriberActivator implements BundleActivator {

	ServiceReference InquiryServiceRef;
	

	public void start(BundleContext context) throws Exception {
		
System.out.println("Start Inquiry Service Subscriber !!!");
		
		InquiryServiceRef = context.getServiceReference(InquiryService.class.getName());
		InquiryService InquiryService = (InquiryService) context.getService(InquiryServiceRef);
		
		Scanner sc = new Scanner(System.in);

		int options1 = 1;
		while (options1 == 1) {

			System.out.println("");
			System.out.println("\t\t\t\t\t    ********************** Welcome to the MediCare ***********************");
			System.out.println("");
			System.out.println("");

			System.out.println("\t\t\t\t\t\t\t                    SERVICES                 ");
			System.out.println("\t\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t    1. Medical Delivery Service");
			System.out.println("\t\t\t\t\t\t\t\t    2. Channeling Service");
			System.out.println("\t\t\t\t\t\t\t\t    3. Labotery Service");
			System.out.println("\t\t\t\t\t\t\t\t    4. Inquery");
			System.out.println("\t\t\t\t\t\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			System.out.println("");


			System.out.print("Please Enter Your Option [1|2|3|4|0] : ");
			int options2 = sc.nextInt();
			
			//Please Enter Your Option [1|2|3|4|0] - 4
			if (options2 == 4) {
				System.out.println("");
				InquiryService.InquiryServicePublish();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No]:   ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("--------------------------------  THANK YOU -----------------------------------------");
					System.out.println("");
				
				}
            
			//Please Enter Your Option [1|2|3|4|0] - 0
			}else if (options2 == 0) {

				System.out.println("");
				System.out.println("--------------------------------  THANK YOU -----------------------------------------");
				System.out.println("");
				return;
			
			//Please Enter Your Option [1|2|3|4|0] - Other Number(5,6,7...)
			
			} else {
				System.out.println("");
				System.out.println("Invalid Input.! Do you want to continue? [Type 1 = Yes | Type 2 = No] : ");
				
			//Do you want to continue? - 1		
				options1 = sc.nextInt();

			//Do you want to continue? - 2	
				if (options1 == 2) {
					System.out.println("");
					System.out.println("--------------------------------  THANK YOU -----------------------------------------");
					System.out.println("");
				}
			}

		}

	}
	

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Inquiry Service Subscriber !!!");
		context.ungetService(InquiryServiceRef);
	}

}
