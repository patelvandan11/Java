import java.util.Scanner;

class Cricket {
    protected String name;
    protected int age;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setdata(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Match extends Cricket {
    private int no_of_odi;
    
    private int no_of_test;

    public void display() {
        super.display();
        System.out.println("Number of ODIs: " + no_of_odi);
        System.out.println("Number of Tests: " + no_of_test);
    }

    public void setdata(String name, int age, int no_of_odi, int no_of_test) {
        super.setdata(name, age);
        this.no_of_odi = no_of_odi;
        this.no_of_test = no_of_test;
    }
}

public class Three {
    public static void main(String[] args) {
        Match[] matches = new Match[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matches.length; i++) {
            System.out.println("Enter details for Match " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Number of ODIs: ");
            int no_of_odi = scanner.nextInt();
            System.out.print("Number of Tests: ");
            int no_of_test = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            matches[i] = new Match();
            matches[i].setdata(name, age, no_of_odi, no_of_test);
        }

        System.out.println("Match Information:");
        for (int i = 0; i < matches.length; i++) {
            System.out.println("Match " + (i + 1));
            matches[i].display();
            System.out.println();
        }

        scanner.close();
    }
}