import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    protected CalculatorImpl() throws RemoteException {
        super(); 
        // the call of super
        // delegates the low-level setup of sockets, stubs, and
        // RMI environment to the UnicastRemoteObject class, simplifying the implementation of remote objects. 
        // we can skip this by calling the UnicastRemoteObject.exportObject(this, 0) as well
        // simply it calls the constructor of UnicastRemoteObject Class

    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}

