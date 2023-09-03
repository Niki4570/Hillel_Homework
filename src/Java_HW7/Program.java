package Java_HW7;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hello", 'l'));
        System.out.println(findWordPosition("Wooorld", "o"));
        System.out.println(stringReverse("It's me"));
        System.out.println(isPalindrome("Rotor"));
        guessingGame();
    }

    public static int findSymbolOccurance(String str, char x) {
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                a++;
            }
        }
        return a;
    }

    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            int a = source.indexOf(target);
            return a;
        } else {
            return -1;
        }
    }

    public static String stringReverse(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }

    public static boolean isPalindrome(String str0) {
        boolean pal = false;
        String str1 = str0.toLowerCase();
        String result = new StringBuilder(str1).reverse().toString();
        return result.equals(str1);
    }

    public static void guessingGame(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int limit = 25;
        String guess = words[rand.nextInt(limit)];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your answer");
        String answer = in.next();
        if (answer.equals(guess)){
            System.out.println("Correct");
        }
        else {
            do{
                System.out.println("Incorrect. Word is " + guess.charAt(0) + guess.charAt(1) + "#############");
                System.out.println("Enter your answer");
                answer = in.next();
            }
            while (answer.equals(guess) == false);
            System.out.println("Correct");
        }
    }
}