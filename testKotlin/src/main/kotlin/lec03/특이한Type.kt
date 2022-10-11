package lec03

fun main() {

    /**
     * 1. Any
     * - 애니는 자바에서 Object와 같은 역할을함ㅎ_ㅎ
     * - primitive Type 과 Reference Type 의 최상위 타입!
     * - Any 자체로는 null 하려면 Any? 으로 표현~ㅎ
     * - 메소드는 Any.equals 와 Any.hasCode 와 Any.toString 등이 있음
     *
     * 2. Unit
     *  - Unit = void 와 동일 함수에서 반환값없을때~
     *
     *  3. Nothing
     *  함수가 정상적으로 끝나지않았다? type 중에 Nothing 이있으면
     *  어... throw Exception 같은 무한루프함수 예외 반환하는 함수에 써줌 애매해서?
     *
     *  4. ${person.name} 오 ㅋ 자바스크립같다 뷰같다
     *  좋다조다 이거 가독성좋다~
     *  일괄 변환~?
     *  정규식 활용에도좋댕 ㅎ
     *
     *  5. 보통 자바는 stringbuilder.append("ㅇ") 넣어줌 넣어줌 으로 사용하는데
     *  """
     *      ABC
     *      가나다
     *      $name
     *  """.trimIndent()
     *
     *  6. str.charAt(1) 으로 1번째 인덱스가져옴
     *  코틀린에서는??? 오 개편해 ㅎㅎ
     */
    val str = "ABC"
    println(str[0])
    println(str[1])

}
