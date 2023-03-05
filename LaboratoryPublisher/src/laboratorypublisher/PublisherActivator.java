package laboratorypublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class PublisherActivator implements BundleActivator {

	ServiceRegistration LaboratoryTest;	
	
public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Laboratory Test Publisher!");
		LaboratoryTest  LaboratoryTestPublisherService = (laboratorypublisher.LaboratoryTest) new LaboratoryTestImpl();
		LaboratoryTest = context.registerService(LaboratoryTest.class.getName(), LaboratoryTestPublisherService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Stop  Laboratory Test Publisher!");
		LaboratoryTest.unregister();
		
	}

}