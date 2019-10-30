package ca.khashayar;

import java.util.Scanner;

public class Exceptions {
    public static void exception(){

        System.out.println("welcome to Java");

        try {
            String num1 = "10a";
            String num2 = "5";
            System.out.println(divide(Double.parseDouble(num1),Double.parseDouble(num2)));
        }catch (ArithmeticException e){
            RegularExpressions.red("Arithmetic Exception error : " + e.getMessage());
        }catch (NumberFormatException e){
            RegularExpressions.red("Number format exception error : " + e.getMessage());
        }
        finally {
            System.out.println("");
        }



        try{
            System.out.println(5/0);
        } catch (ArithmeticException divide){
            System.out.println("error : " + divide.getMessage());
        } finally {
            System.out.println("Arithmetic exception is done.");
            System.out.println("________________");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e){
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println(" Null exception is done. ");
            System.out.println("________________");
        }

        try {
            int[] nums = {1,2,3,4,5};
            System.out.println(nums[5]);

        } catch (ArrayIndexOutOfBoundsException d){
            RegularExpressions.red("error : " + d.getMessage() );

        } finally {
            System.out.println("Array index out of bounds exception is done.");
            System.out.println("________________");
        }

        System.out.println("thanks for using Java");

        try{
            double result = divide(5,0);
            System.out.println("your first payment is : " + result/2);
            System.out.println("your second payment is : " + result/2);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("custom divide by zero exception is done.");
            System.out.println("________________");
        }

        //hash code..
        System.out.println("AB".hashCode());






        Scanner sn = new Scanner(System.in);
        while (true) {
            System.out.println(" ? ");
            double k;
            if (sn.hasNextDouble()) {
                k = sn.nextDouble();
                System.out.println("double value is : " + k);
            } else {
                System.out.println("that is not a double value! Try again");
                sn.next();
            }
        }

    }

    static double divide(double a , double b){
        if (b == 0 ) throw new ArithmeticException("divide by zero exception detected");
        return a/b;}

}

