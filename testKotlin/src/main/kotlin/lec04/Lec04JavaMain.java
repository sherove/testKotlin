package lec04;

public class Lec04JavaMain {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2000L);
        JavaMoney money2 = new JavaMoney(1000L);

        if(money1.compareTo(money2) > 0 ) {
            System.out.println("money1이 money2보다 금액이 큽니다.");
        }
    }
}
