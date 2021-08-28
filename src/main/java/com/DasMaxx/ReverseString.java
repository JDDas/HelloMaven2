package com.DasMaxx;

public class ReverseString {
    public static void main(String[] args) {

        String Name = "I am from Minnesota";
        String reversedString = "";

        for(int i = Name.length()-1; i>=0; i--){
            reversedString = reversedString + Name.charAt(i);
        }

        System.out.print("The reversed string of the '"+ Name+"' is: " );
        System.out.println(reversedString);
    }
}
