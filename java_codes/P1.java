// class P1{
//     public static void main(String[] args){
//         int a,b,c=0; //a and b are variable and c is operator
//         a = Integer.parseInt(args[0]);
//         b = Integer.parseInt(args[2]);
        
//         switch(args[1]){
//             case "+": c = a + b;
//             break;
//             case "-":c = a - b;
//             break;
//             case "*":c = a * b;
//             break;
//             case "/":c = a / b;
//             break;
//             default:
//             System.out.println("You entered a wrong operator");
//         }
//         System.out.println("Answer is :" + c);
//     }
// }


class P1 {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}