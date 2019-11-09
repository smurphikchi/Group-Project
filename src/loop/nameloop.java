package loop;

import java.util.Scanner;

public class nameloop {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        // String name = input.nextLine();

        for (int i = 0; i < 5; i++) {
            String name = input.nextLine();
            System.out.println(name);
        }

        for (; ; ) {
            String word1 = input.nextLine();
            if (word1.equals("hi")) {
                System.out.println("Hello");
            } else  {
                System.out.println("Good Bye");
            }
            }

        }
    }

