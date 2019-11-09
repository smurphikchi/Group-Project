package Methods;

import java.util.Scanner;

public class validornot {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String account = input.nextLine();

        if (account.charAt(0) == '2') {

            if (account.length() == 7) {
                System.out.println("valid 2 account");

            } else {
            System.out.println("invalid 2 account");

        }
    }   else if(account.charAt(0)=='5'){
            if (account.length()==10){
                System.out.println("invalid 5 account");

            }
            }

            }
    }

