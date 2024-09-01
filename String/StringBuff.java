public class StringBuff { 

    // Method to concatenate using String
    public static String concatWithString() { 
        String t = "ADIT"; 
        for (int i = 0; i < 10000; i++) { 
            t = t + "Computer"; 
        } 
        return t; 
    } 

    // Method to concatenate using StringBuffer
    public static String concatWithStringBuffer() { 
        // Use the built-in StringBuffer class
        StringBuffer sb = new StringBuffer("ADIT"); 
        for (int i = 0; i < 10000; i++) { 
            sb.append("Computer"); 
        } 
        return sb.toString(); 
    } 

    public static void main(String[] args) { 
        long startTime = System.currentTimeMillis(); 

        concatWithString(); 
        System.out.println("Time taken by Concatenating with String: " 
            + (System.currentTimeMillis() - startTime) + "ms"); 

        startTime = System.currentTimeMillis(); 

        concatWithStringBuffer(); 
        System.out.println("Time taken by Concatenating with StringBuffer: " 
            + (System.currentTimeMillis() - startTime) + "ms"); 
    } 
}
