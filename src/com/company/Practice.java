package com.company;
import java.util.Scanner;
class Practice{
    public static int subtractBits(int num1, int num2) {

        int tempSub , tempBorrow;
        while(num2!=0){
            tempSub  = num1 ^ num2;
            tempBorrow =  ~num1 & tempSub;
            tempBorrow = tempBorrow << 1;

            num1 = tempSub;
            num2 = tempBorrow;
        }
        return num1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int answer = subtractBits(num1, num2);
        System.out.println(answer);
    }
}