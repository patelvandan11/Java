// Step 1: Define a custom exception by extending the Exception class
class InvalidAgeException extends Exception {
    
    // Step 2: Constructor that accepts an error message
    public InvalidAgeException(String message) {
        super(message);
    }
}
// Step 1: Define a custom exception by extending the Exception class
class vandan extends Exception {
    
    // Step 2: Constructor that accepts an error message
    public vandan(String message) {
        super(message);
    }
}

public class CustomException {
    
    // Method that checks the age and throws the custom exception if invalid
    public static void checkAge(int age) throws InvalidAgeException,vandan {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Access denied.");
        } 
        
        else {
            System.out.println("Access granted.");
            throw new vandan("Age is less than 18. beivrhvir denied.");
        }
    }

    public static void main(String[] args) {
        try {
             
            checkAge(15);
        } catch (InvalidAgeException e) {
        
            System.out.println("Caught Exception: " + e.getMessage());
        }
        catch (vandan e) {
            // Handling the custom exception
            System.out.println("v Exception: " + e.getMessage());
        }
    }
}
