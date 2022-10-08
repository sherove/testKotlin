package lec01

fun main() {
    // NOTE var 과 val 의 차이
    // 그냥 코틀린은 val으로 쓰고 나중에 변경가능한 값에 대해서만 var으로 ㄱㄱ
    var name1: String? = "몽"
    val name2: String = "윤"
    name1 = "김" // 몽에서 김으로 바뀜^^
    // 불가능 name2 = "유녕" // 불가능


    // NOTE Long 과 long 차이
    // 그냥 코틀린은 Long으로 통일함. 더할때 지가 primitive 타입을 바꿔서 연산함
    var number1: Long = 1000L
    var number2: Long = 1_000L
    println(number1 + number2)

    // NOTE 코틀린에서는 디폴트로 널 안됨. 널쓰려면 뒤에 타입? 붙여야함
     name1 = null //


}