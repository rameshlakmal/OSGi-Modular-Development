package medicalreportdeliveryservicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import medicalreportdeliveryservicepublisher.MedicalReportDeliveryService;

public class MedicalReportDeliveryServiceSubscriberActivator implements BundleActivator {

	ServiceReference MedicalDeliveryRef;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Welcome to Medicare Clinic Store!!!...");
		

		MedicalDeliveryRef = context.getServiceReference(MedicalReportDeliveryService.class.getName());
		MedicalReportDeliveryService MedicalDeliveryService = (MedicalReportDeliveryService) context.getService(MedicalDeliveryRef);

		Scanner sc = new Scanner(System.in);

		int opt = 1;
		while (opt == 1) {

			System.out.println("");
			System.out.println("\t\t\t\t\t    ********************** Welcome to the MediCare ***********************");
			System.out.println("");
			System.out.println("");

			System.out.println("\t\t\t\t\t\t\t                    SERVICES                 ");
			System.out.println("\t\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t    1. Medical Report Delivery Service");
			System.out.println("\t\t\t\t\t\t\t\t    2. Channeling Service");
			System.out.println("\t\t\t\t\t\t\t\t    3. Labotery Service");
			System.out.println("\t\t\t\t\t\t\t\t    4. Inquery");
			System.out.println("\t\t\t\t\t\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			System.out.println("");


			System.out.print("Please Enter Your Prefer Service(1/2/3/4/0) :");
			int option = sc.nextInt();

			if (option == 1) {
				System.out.println("");
				MedicalDeliveryService.publishService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				opt = sc.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else {
				System.out.println("");
				System.out.println("Unavailable Service!!!...Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				opt = sc.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}

			while (opt != 1 && opt != 2) {
				System.out.println("");
				System.out.println("Unavailable Service!!!...");
				System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
				opt = sc.nextInt();

				if (opt == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}

		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Dashboard!!!...");
		context.ungetService(MedicalDeliveryRef);
		
	}
}