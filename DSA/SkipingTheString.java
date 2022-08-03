package DSA;

public class SkipingTheString {
    public static void main(String[] args) {
        String skip="A";
        String str="AABABCABCD"; //OUTPUT WILL BE BBCBCD
        System.out.println("Input String "+ str);
        System.out.println("New String "+ skiping(str,skip));
        System.out.println("New String "+ skipingRecursion(str,skip,""));
    }
    public static String skiping(String s,String skip){
        if (s == null || s.length()==0) {
            return "Sorry! plz enter new String";
        }
        String str="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='A') {
                str=str+s.charAt(i);
            }
        }
        return str;
    }
    public static String skipingRecursion(String s,String skip,String returnString){
        if (s == null || s.length()==0) {
            return "Sorry! plz enter new String";
        }


        return "";
    }
}
