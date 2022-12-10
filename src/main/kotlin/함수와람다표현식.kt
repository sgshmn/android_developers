fun main() {
//    val coins: (Int) -> String = {
//        "$it quarters"
//    }

//    val cupcake: (Int) -> String = {
//        "Have a cupcake!"
//    }

//    val treatFunction = trickOrTreat(false, coins)
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
//    treatFunction()
//    trickFunction()

    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

// 람다 표현식 : fun 키워드 없이 함수를 정의하는 방법. 다른 함수에 관함 함수 참조 없이 변수에 직접 저장할 수 있다

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        if (extraTreat != null) { // 왜 repeat 함수의 2번째 반복부터 null이 될까?
            println(extraTreat(5))
        }
        treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}