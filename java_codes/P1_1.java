class P1{
    public static void main(String[] args){
        int a,b,c=0; //a and b are variable and c is operator
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[2]);
        
        switch(args[1]){
            case "+": c = a + b;
            break;
            case "-":c = a - b;
            break;
            case "*":c = a * b;
            break;
            case "/":c = a / b;
            break;
            default:
            System.out.println("You entered a wrong operator");
        }
        System.out.println("Answer is :" + c);
    }
}