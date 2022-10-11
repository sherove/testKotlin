package lec04;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney>{
    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney next) {
        return Long.compare(this.amount, next.amount); // 현재를 기준으로 next보다 크면 양수!
    }
}
