package com.stackroute.pe3;

import java.util.Scanner;

public class StudentData extends Exception {

    public static void main(String[] args) throws MyException{

        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students :: ");
        num = input.nextInt();

        int[] data = new int[num];

        // enters the marks
        System.out.println("Enter the marks :: ");

        for(int i=0; i<num; i++){
            data[i] = input.nextInt();
        }

        // checks if the marks are in the range 0 -100 else throws exception
        try {
            for (int i = 0; i < num; i++) {
                if (data[i] < 0 || data[i] > 100)
                    throw new MyException("Invalid Marks");
            }
        }
        catch (MyException x){
            System.out.println(x);
            }
        finally{
            System.out.println("Finally arrived");
        }

    }

}
