package com.stackroute.pe3;

public class TryCatch extends Exception {
/*
 * function to demonstrate the working of my exception
 */

    public static void main(String[] args) throws MyException{



        try {
            if(true)
            throw new MyException("TOO HIGH");
        }
        catch (Exception e) {

            System.out.println("Exception caught :: "+e);

        }
        finally{
            System.out.println("finally block");
        }

    }

}

