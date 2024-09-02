public class P1_1 {
    public static void main(String args[]){
        int result=0;
        if(args.length!=3){
            System.out.println("enter 3 command line arguments");
        }
        else{
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[2]);
            switch(args[1]){
                case "+":
                    result=n1+n2;
                    break;
                case "-":
                    result=n1-n2;
                    break;
                case "/":
                    result=n1/n2;
                    break;
                default:
                    System.out.println("invalid operator");
                System.out.println("Result:"+result);
            }
        }
        
    }
}
