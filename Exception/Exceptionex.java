public class Exceptionex {
    static void demo(){
        try{
        throw new NullPointerException("This is an exception");
    }
    catch(NullPointerException e){
        System.out.println("Caught the exception");
        throw e;
    }
}
    public static void main(String[] args){
        try{
            demo();
        }
        catch(Exception e){
            System.out.println("hy   "     +e);
        }
    }
    
}
