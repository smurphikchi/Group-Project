package ThursdayMentors;

public class Polindrome {
    public static void main(String[] args){
        char[] c=new char[1000000];
        String str= new String(c);

        long start = System.currentTimeMillis();
        System.out.println(isPolindrome(str));
        long end = System.currentTimeMillis();
        System.out.println(start- end);

    }
    static boolean isPolindrome(String s) {

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
            return s.equals(reversed);
        }

    static boolean isPolindromeBetter(String s) {
        boolean polindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                polindrome = false;
                break;
            }
        }
        return polindrome;
    }


}

