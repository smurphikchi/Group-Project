package loop;

import java.util.Scanner;

public class october23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your address");
        String word=input.nextLine();
        int count=0;
        while (word.contains("il")){
            count++;
            System.out.println("enter your address");
            word=input.nextLine();
        }
        System.out.println((count));
    }
}
