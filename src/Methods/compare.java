package Methods;

public class compare {
    public static void main(String[]args){
        String word1 = "james";
        String word2 = "James";
        String word3 = "5java";
        System.out.println(word1.compareTo(word2));
        System.out.println(word2.compareTo(word3));
        System.out.println(word3.compareTo(word1));
        System.out.println(("james").compareTo(word1));
    }
}
