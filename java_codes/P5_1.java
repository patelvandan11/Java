public class P5_1 {
    public static void main(String[] args) {
        // Example usage
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.RAM ram = cpu.new RAM();
        
        // Set values
        cpu.price = 250.0;
        processor.cores = 4;
        processor.cache = 8.0;
        processor.manufacturer = "Intel";
        ram.memory = 16.0;
        ram.manufacturer = "Corsair";
        ram.clockSpeed = 3200.0;
        
        // Display details
        processor.displayProcessorDetail();
        ram.displayRAMDetail();
    }
}

class CPU {
    double price;

    class Processor { // nested class
        double cores;
        double cache;
        String manufacturer;

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

    protected class RAM { // nested protected class
        double memory;
        String manufacturer;
        double clockSpeed;

        double getClockSpeed() {
            return clockSpeed;
        }

        void displayRAMDetail() {
            System.out.println("RAM Details:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Clock Speed: " + clockSpeed + "MHz");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}
