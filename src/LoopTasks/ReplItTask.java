package LoopTasks;

import java.util.Scanner;

public class ReplItTask {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
     //   Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
      String str=scanner.nextLine();
        int length = str.length();
        char lastLetter = str.charAt( length - 1 );
        System.out.println(lastLetter + str + lastLetter);

        }

        }

