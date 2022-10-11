package lec04

fun main() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)


    // NOTE 자바와 다르게 객체를 비교할떄 비교 연산자를 사용하면 자동으로 compreTo를 호출해줌 ㅎ
    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다.")
    }


    val money3 = JavaMoney(1000L)
    val money4 = money3
    val money5 = JavaMoney(1000L)

    println(money3===money4)
    println(money3===money5) // === 동등성!!
}