package com.stackroute.pe3;

public class NameOfPlaces {

    public String[] noVovel(String[] in){

        if (in != null) {
            String[] out = new String[in.length];
            for (int i = 0; i < in.length; i++) {
                out[i] = "";
                for (int j = 0; j < in[i].length(); j++) {
                    if (!isVovel(in[i].charAt(j))) {
                        out[i] += in[i].charAt(j);
                    }
                }
            }
            return out;
        }
        return null;


    }

    static boolean isVovel (char c_in){

        switch(c_in){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default : return false;
        }

    }

}
