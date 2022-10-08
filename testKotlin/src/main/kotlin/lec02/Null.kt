package lec02

// NOTE .? ?:
fun main() {
    var name: String = "김"
    var str: String? = "ㅎㅇ" // NULL 가능
    println(name.length)
//    println(str.length) // 에러 빨간줄
    println(str?.length) // str?. 이렇게 붙여줌
    // NOTE 결론 :  .? 붙이면 null이 아니면 length 호출

    // NOTE str을 null으로 바꿔보자
    str = null
    println(str?.length) // null 나옴~

    // NOTE 엘비스 연산자 ?:
    println(str?.length ?: "모야")

}

// 자바랑 똑같이 코드 작성해보자..ㅎㅎ
fun startsWithA1(str: String?): Boolean { // 자바처럼 String null 가능하게 타입? 붙여줌
    if(str == null) {
        throw IllegalArgumentException("null 이 드러옴")
    }
    return str.startsWith("A")
}

// NOTE Boolean?
fun startsWithA2(str: String): Boolean? {
    if(str == null) {
        return null
    }
    return str.startsWith("A")
}

// str 자체가 null 불가능하게!! 디폴트로~
fun startsWithA3(str: String?): Boolean {
    if(str == null){
        return false
    }
    return str.startsWith("A")
}

fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

// NOTE 즉 코틀린에서는 null 이 가능한 타입을 전~~혀~~ 다르게 취급한다!


fun startsWithA(str: String): Boolean {
    return str!!.startsWith("A")
}
