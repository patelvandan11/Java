abstract class Popcorn{
    public abstract void taste();
}
class AbstarcClassPopcorn{
    public static void main(String[] args) {
        Popcorn p = new Popcorn(){
            public void taste(){
                System.out.println("salty");
            }
        };
        p.taste();
    }
}