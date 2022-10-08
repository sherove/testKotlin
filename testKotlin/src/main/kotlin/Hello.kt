fun main() {
    println("gd")
    var name1: String? = "몽"
    val name2: String = "윤"
    name1 = "김" // 몽에서 김으로 바뀜^^
    // 불가능 name2 = "유녕" // 불가능

    var number1: Long = 1000L
   var number2: Long = 1_000L
    println(number1 + number2)

    // 코틀린에서는 디폴트로 널 불가능!!
     name1 = null //


}