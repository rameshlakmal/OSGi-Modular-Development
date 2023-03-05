package docchannalingservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ChannelingSerivceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		ChannelingService publishService = new ChannelingServiceImpl();
		publishServiceRegistration = context.registerService(ChannelingService.class.getName(),publishService,null);
		System.out.println("Start Channeling Service");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher stop");
		publishServiceRegistration.unregister();
		System.out.println("Stop Channeling Service");

	}
	



}
