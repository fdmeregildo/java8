package lambda;

import lambda.service.Operation;
import lambda.service.OperationImpl;

public class Lambda2Syntax {

    public void syntaxis(){

        Operation op1 = new OperationImpl();
        System.out.println("getAverage 1: "+op1.getAverage(2,7));

        Operation op2 = new Operation() {

            @Override
            public double getAverage(double n1, double n2) {
                return (n1+n2)/2;
            }
        };
        System.out.println("getAverage 2: "+op2.getAverage(4,5));


        Operation op3 = (x, y) -> x*y;
        System.out.println("getAverage 3: "+op3.getAverage(2, 3));


        Operation op4 = (n1, n2) -> {
            System.out.println("more than one line.. ");
            return n1+(2*n2);
        };
        System.out.println("getAverage 3: "+op4.getAverage(5, 5));


    }


    public static void main(String[] args) {

        Lambda2Syntax syntax = new Lambda2Syntax();
        syntax.syntaxis();
    }
}
