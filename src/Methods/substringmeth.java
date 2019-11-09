package Methods;

import java.util.Scanner;

public class substringmeth {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word1 = input.nextLine().trim();
    String word2 = input.nextLine().trim();
    String email = "";
    boolean check = true;

    if (word1.length() >= 6 && word2.length() >= 6) {
        email = word1.substring(0, 4);
        email += word2.substring(word2.length() - 3);
        email += "@cybertek.com";
        System.out.println(email);
    } else {
        System.out.println("invalid length");
    }


    String info = "Sender: <James Bond> Phone number: [202-202-2022] Msg: {I would love to finish my homework}";
    int senderStart = info.indexOf("<") + 1;
    int senderEnd = info.indexOf(">");

    int phoneStart = info.indexOf("[") + 1;
    int phoneEnd = info.indexOf("]");

    int msgStart = info.indexOf("{") + 1;
    int msgEnd = info.indexOf("}");
    // String sender = senderStart+senderEnd;
    String sender = info.substring(senderStart, senderEnd);
    String number = info.substring(phoneStart, phoneEnd);
    String message = info.substring(msgStart, msgEnd);

    System.out.println("Sender: " + sender);  /// "Sender: " + sender + "\nNumber"
    System.out.println("Number: " + number);
    System.out.println("Message: " + message);


//
//    System.out.println("Sender:"+  sender);
//     System.out.println("number:"+phoneStart+phoneEnd);
//     System.out.println("msg:"+msgStart+msgEnd);
//
//
//
}
}
