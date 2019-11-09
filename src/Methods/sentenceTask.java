package Methods;

import java.util.Scanner;

public class sentenceTask {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int word1 = sentence.indexOf(" ");
        String word2 = sentence.substring(0,word1);
        String word3 = sentence.substring(word1+1);
        System.out.println(word3+ " "+ word2);
    }
}
