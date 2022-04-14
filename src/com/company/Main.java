package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner alp = new Scanner(System.in);
        System.out.println("\nEnter Character: ");
        String newAlphabet = alp.nextLine();

 //janjanbarangan
        int index = alphabet.indexOf(newAlphabet);
        int newIndex = index + 1;
        System.out.println(newAlphabet + " has an index of " +
                newIndex);
    }
}