package lec02;

public class Null {

    public static void main(String[] args) {
        String aa = null;
        System.out.println(aa.startsWith("A")); // NullPointerException
    }

    public boolean starWithA1(String str) {
        if(str == null) {
            return false;
        }
        return str.startsWith("A");
    }
}
