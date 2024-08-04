public class SingleToneClass {
    private static SingleToneClass instance = null;
    
    // Private constructor to prevent instantiation
    private SingleToneClass() {}
    
    // Method to get the single instance of the class
    public static SingleToneClass getInstance() {
        if (instance == null) {
            instance = new SingleToneClass();
        }
        return instance;
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(SingleToneClass.getInstance().hashCode());
        System.out.println(SingleToneClass.getInstance().hashCode());
    }
}
