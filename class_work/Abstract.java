// Save this file as AbstractRto.java

abstract class AbstractRto {
    public abstract void tostart();
    public void tostop() {
        System.out.println("Rto is stopping");
    }
}

class Vehicle extends AbstractRto {
    @Override
    public void tostart() {
        System.out.println("start by kick");
    }
}

class Scooty extends Vehicle {
    
}

class Active extends Vehicle {
    @Override
    public void tostart() {
        System.out.println("start by kick + self");
    }
}

class Test {
    public static void main(String[] args) {
        AbstractRto rto = new Active();  // Use polymorphism
        rto.tostart();
        rto.tostop();
    }
}
