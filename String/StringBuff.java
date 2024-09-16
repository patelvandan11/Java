public class StringBuff {
    public static void main(String[] args) {
        // Using String
        String str = "Hello";
        str += " World";
        System.out.println("Using String: " + str);

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        System.out.println("Using StringBuffer: " + stringBuffer.toString());
    }
}