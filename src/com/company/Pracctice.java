package com.company;

public class Pracctice {
    static String name = "Ankit pareek , M";

    public static void main(String[] args) {
        String[] nameGender = new String[2];
        nameGender = name.split(",");
        for (String item: nameGender) {
            if(nameGender[1]=="M")
                System.out.print("Mr.");
            else
                System.out.print("Ms");
        }
    }
}
