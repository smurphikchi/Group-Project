package Methods;

import java.util.Scanner;

public class NameTask {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String name= input.nextLine();

        String firstLetter= name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();

        String restOfTheWord = name.substring(1);
        System.out.println(firstLetter+restOfTheWord);

    }
}
