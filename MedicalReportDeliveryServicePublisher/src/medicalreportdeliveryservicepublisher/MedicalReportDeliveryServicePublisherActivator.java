package medicalreportdeliveryservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MedicalReportDeliveryServicePublisherActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		MedicalReportDeliveryService publishService = new MedicalReportDeliveryServiceImpl();
		publishServiceRegistration = context.registerService(MedicalReportDeliveryService.class.getName(), publishService,null);
		System.out.println("Start Hospital Service");
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		System.out.println("Stop Hospital Service");
	}

}
