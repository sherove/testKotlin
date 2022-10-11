package lec02
// NOTE 코틀린코드에서 자바코드를 가져다 쓸때 null 인지 아닌지 확인불가능 = 플랫폼타임
// NOTE annotaion 을 이용해서 체크해준다
// NOTE @NotNull & @Nullable
// NOTE 컴파일단 > 런타임단 에서 에러 잡히는 순서임..
// NOTE 컴파일단에서 오류나면 빨간줄뜸
// NOTE 런타임단에서는 오류안뜨고 돌려보고나서 nullPointException

fun main() {
    val p1 = Person(null, null)
    println(p1.name?.length ?: "이름없대ㅡㅡ")
}

class Person(name :String?, age :Int?) {
    val name = name
    val age = age
}

class Animal(nickName : String?) {
    val nickName = nickName
}
