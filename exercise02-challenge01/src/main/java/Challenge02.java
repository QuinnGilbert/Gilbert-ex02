/*
 *  UCF COP3330 Fall 2021 Exercise 2
 *  Copyright 2021 Quinn Gilbert
 */

import java.util.*;
public class Challenge02 {
    public static void main(String[] args) {
        System.out.print("What is the input string? ");
        String s = new Scanner(System.in).nextLine();
        if(s.equals("")){
            System.out.println("You must enter something!");
        }else{
            System.out.println(s+" has "+s.length()+" characters");
        }
    }
}