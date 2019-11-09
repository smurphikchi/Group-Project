package Method;

import javax.xml.transform.stream.StreamSource;

public class DataTransfer {
    public static void main(String[] args) {
        //the next line will call the method that can be in other class or package
        //input name Mika is not static,we can change anytime,nexttime

        printName("Mika");
        firstChar("mika");
        goTo("china","michigan");
        makeEmail("mahabat", "sadykova", 25);
       // countWords("how many words we have");
        count("how many words i can write in one line");
        lengthOfString("the length is not similar", 5);
        negativeNumbers(45,-34,45,-45);
    }

    public static void printName(String name) {
        System.out.println(name);
    }
    public static void firstChar(String name){
        System.out.println(name.charAt(0));
    }
    public static void goTo(String origin, String location){
        System.out.println("You start from "+origin);
        System.out.println("And your'e going to "+location);
    }
    public static void makeEmail(String firstName,String lastName,int age){
        String email=firstName+age+lastName+"@gmail.com";
        System.out.println(email);
    }
//    public static void countWords(String words){
//
//        for (int i =0; i<words.length();i++){
//            int numberOfords=words.length();
//            System.out.println("The number of words in the sentence is: "+numberOfords);
//        }
//    }
    public static void count(String str){
        String [] arr = str.trim().split(" ");
        System.out.println("The number of words in the sentence is: "+arr.length);

    }
    public static void lengthOfString(String str, int leng){
        if(str.length()==leng){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

    }
    public static void negativeNumbers(int ... arr){
        for (int num: arr){
            if(num<0){
                System.out.println(num);
            }
        }
    }
}
