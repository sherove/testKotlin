package lec03

import lec02.Animal
import lec02.Person

fun main() {
    val number1 = 3
//    val number2: Long = number1 // mismatch 에러!!
    val number3: Long = number1.toLong() // mismatch 에러!!
    val result = number1 / number3.toDouble() // 더블로 나옴 ㅎ 명시적이어야행

    var intNum: Int? = 3
    val aa = intNum?.toLong() ?: 0L // 널일경우처리함ㅎㅎ

    printAgeIFPerson(Person("매애애맹", 24))
    printAgeIFPerson(Animal("염소"))
    printAgeIFPerson(null) // 3. null 일때는???
}

fun printAgeIFPerson(obj: Any?) {
    if (obj is Person) {
        val person  = obj as Person // NOTE (person) 과 같음 = as 형변환
        println(person.name + " , " + person.age)
    }

    if (obj !is Person) {
        println("사람아니래..그럼 동물???")
    }

    // 3. null 일때는??? nullable 가능하도록
    // NOTE Person? 와 as? 으로 널러블~~~~~~~~~~~
    val person: Person? = obj as? Person // NOTE 사람^^타입으로 명시적 형변환 ㄱ
    val aa = person?.age ?: " 널이래^"
    println("요기ㅎ_ㅎ 나이눙... $aa")
}