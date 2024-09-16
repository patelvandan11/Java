public class Wrraper_class {
    
    public static void main(String[] args) {
        // Creating Wrapper class objects
    Integer intObj = Integer.valueOf(10);
    Double doubleObj = Double.valueOf(5.55);
    Character charObj = Character.valueOf('a');

    // Converting Wrapper class objects to primitive types
    int intValue = intObj.intValue();
    double doubleValue = doubleObj.doubleValue();
    char charValue = charObj.charValue();

    // Printing values
    System.out.println("Integer object: " + intObj);
    System.out.println("Double object: " + doubleObj);
    System.out.println("Character object: " + charObj);
    System.out.println("int value: " + intValue);
    System.out.println("double value: " + doubleValue);
    System.out.println("char value: " + charValue);
    
    // Using some Wrapper class methods
    System.out.println("Integer to Hex String: " + Integer.toHexString(intObj));
    System.out.println("Double to String: " + Double.toString(doubleObj));
    System.out.println("Character is digit: " + Character.isDigit(charObj));
    System.out.println("Character is letter: " + Character.isLetter(charObj));
}
}