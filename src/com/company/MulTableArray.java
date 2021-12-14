package com.company;

public class MulTableArray
{
    public static void main(String[] args) {
        // write your code here
        int index=0;
        int mulTable[] = new int[30];
        for(int i = 1; i<4; i++ ){
            for(int j=1 ; j<=10 ; j++ ){
                mulTable[index] = i*j;
                index++;
            }
        }
        for (int x=0 ; x<30; x++){
            if(mulTable[x]> 20)
                System.out.println(mulTable[x]);
        }

        // TODO: Display the multiples greater than 20.
    }
}
