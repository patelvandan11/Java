public class ThreadByExtend extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
class Main {
    public static void main(String[] args) {
        ThreadByExtend thread = new ThreadByExtend();
        thread.setName("ThreadByExtend");
        thread.start();
    }
}