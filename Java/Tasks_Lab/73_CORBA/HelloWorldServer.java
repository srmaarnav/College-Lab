import org.omg.CORBA.*;
import org.omg.PortableServer.*;

public class HelloWorldServer {

    // Implementation of the HelloWorld interface
    public static class HelloWorldImpl extends HelloWorldPOA {
        public String sayHello() {
            return "Hello, World!";
        }
    }

    public static void main(String[] args) {
        try {
            // Initialize the ORB (Object Request Broker)
            ORB orb = ORB.init(args, null);
            
            // Create the POA (Portable Object Adapter) that will handle requests
            POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            poa.the_POAManager().activate();

            // Instantiate the HelloWorld implementation
            HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
            
            // Convert the object to a CORBA object reference
            org.omg.CORBA.Object ref = poa.servant_to_reference(helloWorldImpl);
            HelloWorld helloWorld = HelloWorldHelper.narrow(ref);
            
            // Bind the object in the CORBA naming service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            NameComponent path[] = ncRef.to_name("HelloWorld");
            ncRef.rebind(path, helloWorld);
            
            // Wait for client requests
            System.out.println("HelloWorld Server ready and waiting...");
            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
