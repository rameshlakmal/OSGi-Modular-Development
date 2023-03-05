package inquiryservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServicePublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Inquiry Service Publisher !!!!");
		InquiryService InquiryService =  new InquiryServicePublishImpl();
		publishServiceRegistration = context.registerService(InquiryService.class.getName(), InquiryService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Inquiry Service Publisher !!!!");
		publishServiceRegistration.unregister();
	}

}
