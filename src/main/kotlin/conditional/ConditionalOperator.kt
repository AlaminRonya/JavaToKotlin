package conditional

fun main() {    println("Hello");
    check(10);

    var str: String  = check2(42);
    println(str);
    val answerString = generateAnswerString(42);
    println(answerString);
    println(stringLengthFunc("Alamin"));

    val stringMapper = stringMapper("Android") { input -> input.length }
    println(stringMapper);
}

//fun generateAnswerString(countThreshold: Int): String {
//    return if (10 > countThreshold) {
//        "I have the answer."
//    } else {
//        "The answer eludes me."
//    }
//}

fun stringMapper(str: String, mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}

fun stringMapperReturnStr(str: String, mapper: (String) -> String): String {
    // Invoke function
    return mapper(str)
}

fun generateAnswerString(countThreshold: Int): String = if (10 > countThreshold) {
    "I have the answer"
} else {
    "The answer eludes me"
}

val stringLengthFunc: (String) -> Int = { input ->
    input.length
}

fun check2(count: Int ): String {

    return when {
        count == 42 -> "I have the answer."
        count > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }
}

fun check(count: Int ) {
    if (count == 42) {
        println("I have the answer.")
    } else if (count > 35) {
        println("The answer is close.")
    } else {
        println("The answer eludes me.")
    }
}

