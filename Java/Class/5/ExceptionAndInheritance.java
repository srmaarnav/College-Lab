// BaseClass.java
class BaseClass {
    public void riskyMethod(boolean shouldThrow) throws CustomException {
        if (shouldThrow) {
            throw new CustomException("An error occurred in BaseClass!");
        }
        System.out.println("BaseClass: No exception thrown.");
    }
}

// DerivedClass.java
class DerivedClass extends BaseClass {
    @Override
    public void riskyMethod(boolean shouldThrow) throws CustomException {
        if (shouldThrow) {
            throw new CustomException("An error occurred in DerivedClass!");
        }
        System.out.println("DerivedClass: No exception thrown.");
    }
}

// CustomException.java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main.java
public class ExceptionAndInheritance {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        DerivedClass derived = new DerivedClass();

        try {
            base.riskyMethod(false);
            derived.riskyMethod(false);
            base.riskyMethod(true);
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            derived.riskyMethod(true);
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}