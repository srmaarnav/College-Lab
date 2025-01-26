import org.omg.CORBA.*;
import org.omg.CosNaming.*;

public class HelloWorldClient {
    public static void main(String[] args) {
        try {
            // Initialize the ORB
            ORB orb = ORB.init(args, null);
            
            // Obtain the reference to the Naming Service
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            // Look up the HelloWorld object from the Naming Service
            NameComponent path[] = ncRef.to_name("HelloWorld");
            HelloWorld helloWorld = HelloWorldHelper.narrow(ncRef.resolve(path));
            
            // Call the remote method and print the result
            String result = helloWorld.sayHello();
            System.out.println("Server says: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
