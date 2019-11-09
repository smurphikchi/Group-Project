package Method;

public class November6 {

    public static void main(String[] args) {
        System.out.println(chered("name","day",6));
        System.out.println(chered("mika","bek",4));
       System.out.println(content("jababj aba","ja",2 ));

    }
public static String chered(String str1, String str2){
        return str1+str2+str1;

}
public static String  chered(String str1, String str2,int times){
        String word="";
        if(times<=0){
            return "";
        }
        for (int i = 0; i<=times; i++){
            word+=str1;
            if(i == times-1){
                break;
            }
            word+=str2;
        }return word;
}
public static boolean content(String str1, String str2){
        return str1.toLowerCase().startsWith(str2.toLowerCase());
    }

    public static boolean content(String str1, String str2,int number){
        int count=0;
        for (int i = 0; i<str1.length()-str2.length()+1; i++){
           String temp=str1.substring(i,i+ str2.length());
           if (temp.equals(str2)){
               count++;
           }
        }if(number==count) return true;

            return false;

    }
}
