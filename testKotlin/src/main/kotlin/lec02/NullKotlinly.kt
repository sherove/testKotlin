package lec02



fun main () {
    var str: String? = null

    println(str?.startsWith("A"))
    println(startWithA1Kotlinly2(str))
    println(startsWith(str))

    var number: Long? = 10000
    println(calculate(number))
}

fun calculate(number: Long?): Long? {
    // 만약 null 이면 바로 0 으로 리턴해주고싶어 if(number==null) return 0
    number ?: return 0
    return (number+number)
    // NOTE return (number+number) ?: 0  <<<< 이거 되는줄 알았는데 안되네 number+number 에러뜸..ㅎ 
    // NOTE 합쳐서 못쓰고 해줄거면 number ?: return 0 으로 먼저 리턴해줘야되네
}

fun startWithA1Kotlinly1(str: String?): Boolean{
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 드러옴")
}

// NOTE 주의!!!  str?.startWith("A") = null 이다!!!!!!!!!!!!!!! null 이면 null 바로 근야 리턴해줌;신기하네
fun startWithA1Kotlinly2(str: String?): Boolean? {
    return str?.startsWith("A") ?: null
}

fun startWithA1Kotlinly3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}


fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")  // nulll 이아니야아아아 근데 이거 잘안쓸듯
}