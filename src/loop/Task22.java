package loop;

import java.util.Scanner;

public class Task22 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String check=input.nextLine();
        int number=0;

        while(check.equals("yes") || check.equals("y")){
            number++;
            System.out.println("Would you like to add 1");
            check=input.nextLine();

        }



    }
}
