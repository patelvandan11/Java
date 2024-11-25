public class ExceptionEX1 {
    static void demo() throws NullPointerException {
        throw new NullPointerException("This is an exception");
        // throw new NullPointerException("This is an exception");
    }
    public static void main(String[] args) {
        try {
            demo();
        } catch (Exception e) {
           
            System.err.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
