package Methods;

import java.util.Scanner;

public class UserTask {
    public static void main(String[]args){
          String word = "Today is a nice day";
          boolean b = word.startsWith("Today");
          System.out.println(b);
          //the next line will give us ==false (because it's true)
          System.out.println(!word.endsWith("day"));
          //the next line will give us == true (because it's false) we are asking to confirm that the first letter is not starting with "day" and it s giving us a true value,youre right.
          System.out.println(!word.startsWith("day"));

    }}
