public class P5_2 {
    public static void main(String[] args) {
        CPU cpu = new CPU(250.0);
        CPU.Processor processor = cpu.new Processor(4, 3.5, "Intel");
        CPU.RAM ram = cpu.new RAM(16, "Corsair", 3200.0);

        processor.displayProcessorDetail();
        ram.displayRAMDetail();

        // Local inner class
        class LocalInnerClass {
            void display() {
                System.out.println("This is a local inner class.");
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();

        // Anonymous inner class
        Runnable anonymousInnerClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous inner class.");
            }
        };

        anonymousInnerClass.run();
    }
}

class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        double cores;
        double cache;
        String manufacturer;

        Processor(double cores, double cache, String manufacturer) {
            this.cores = cores;
            this.cache = cache;
            this.manufacturer = manufacturer;
        }

        double getCache() {
            return cache;
        }

        void displayProcessorDetail() {
            System.out.println("Processor Details:");
            System.out.println("Cores: " + cores);
            System.out.println("Cache: " + cache);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    protected class RAM {
        double memory;
        String manufacturer;
        double clockSpeed;

        RAM(double memory, String manufacturer, double clockSpeed) {
            this.memory = memory;
            this.manufacturer = manufacturer;
            this.clockSpeed = clockSpeed;
        }

        double getClockSpeed() {
            return clockSpeed;
        }

        void displayRAMDetail() {
            System.out.println("RAM Details:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Clock Speed: " + clockSpeed + "MHz");
        }
    }
}