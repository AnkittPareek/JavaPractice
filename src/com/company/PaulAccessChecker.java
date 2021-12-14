package com.company;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class PaulAccessChecker {

        public static void main(String args[] ) throws Exception {
            String admin = "Paul";
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            // write your code here
            String passcode = "paul";
            if (input.toLowerCase().equals(passcode)){
                System.out.println("Welcome Admin");
            }
            else {
                System.out.println("Access Denied");
            }
            // TODO: Display the whether the user is the admin or the access is denied.

        }
}
