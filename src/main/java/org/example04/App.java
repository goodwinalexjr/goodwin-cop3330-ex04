package org.example04;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner words = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String Noun = words.nextLine();
        System.out.print("Enter a verb: ");
        String Verb = words.nextLine();
        System.out.print("Enter a adjective: ");
        String Adj = words.nextLine();
        System.out.print("Enter a adverb: ");
        String Adv = words.nextLine();
        System.out.println(String.format("Do you %s your %s %s %s? That's hilarious!", Verb, Adj, Noun, Adv));
    }
}
