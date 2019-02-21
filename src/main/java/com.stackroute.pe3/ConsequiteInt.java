package com.stackroute.pe3;

public class ConsequiteInt {

    public boolean checkCons(String in){

        String[] nums = in.split(",");

        //check if each number is greater than the previous
        for (int i=0;i<6;i++){
            if(Integer.parseInt(nums[i])>=Integer.parseInt(nums[i+1])){
                return false;
            }
        }
        return true;
    }

}
