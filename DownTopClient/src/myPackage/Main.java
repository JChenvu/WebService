package myPackage;

import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        System.out.println("SOAP--Calculator Web Service:");

        CalculatorProxy proxy = new CalculatorProxy();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter operator(+£¬-£¬*£¬/): ");
        String operator = input.nextLine();

        System.out.println("x = ");
        double x = input.nextDouble();

        System.out.println("y = ");
        double y = input.nextDouble();

        double result = 0;

        try {

            if(operator.equals("+"))
            result = proxy.add(x, y);
            if(operator.equals("-"))
                result = proxy.sub(x, y);
            if(operator.equals("*"))
                result = proxy.mul(x, y);
            if(operator.equals("/"))
                result = proxy.div(x, y);

        } catch (RemoteException e) {

            e.printStackTrace();
        }

        System.out.println("Output from SOAP Server ......");
        System.out.println("Result = "+ result);
    }

}
