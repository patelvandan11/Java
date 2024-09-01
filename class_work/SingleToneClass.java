public class SingleToneClass {
    private static SingleToneClass instance = null;
    
    
    private SingleToneClass() {}
 
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
