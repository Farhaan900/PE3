package com.stackroute.pe3;

public class ChessBoard {

    public static void main (String[] args){

        String[][] board = new String [8][8];
        //array to select he color
        String[] chooser = {"WW","BB"};

        //stores in a 2d array
        for (int i = 0 ; i < 8; i++){
            for (int j = 0 ; j < 8 ; j++){
                board[i][j] = chooser[(i+j)%2];
            }
        }


        //prints array
        for (int i = 0 ; i < 8; i++){
            for (int j = 0 ; j < 8 ; j++){
                String div = "|";
                if (j==7){
                    div = "";
                }
               System.out.print(board[i][j]+div);
            }
            System.out.println("");
        }

    }

}
