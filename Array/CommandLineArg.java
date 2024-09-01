class CommandLineArg {
    // public static void main(String[] args) {
    //     System.out.println("Your first argument is: " + args[0]);
    // }

 
        public static void main(String args[]) {
        for(int i=0; i<args.length; i++)
        System.out.println("args[" + i + "]: " +
        args[i]);
        }
       
        
}