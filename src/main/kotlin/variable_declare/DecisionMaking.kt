package variable_declare


// TODO: Md. Al Amin (01750349979)
fun main() {
    var a: Int = 10;
    var b: Int = 15;
    println("Int max value: ${Int.MAX_VALUE}");
    println("Int min value: ${Int.MIN_VALUE}");
    if (a > b){
        println("a is greater than b.");
    }else if(a < b){
        println("a is less than b.");
    }else{
        println("a is equal than b.");
    }

    val result:String = if (a==b) "yes" else "no";
}


class DecisionMaking {

    public fun returnIf() {
        var a: Int = 10;
        var text = if (a in 9..20){
            println("$a is greater than 9.");
            "This number is greater than 9."
        }else{
            println("$a is less than 9.");
            "This number is less than 9."
        }
    }


     fun switchCaseConvertWhen(){
        val a = 12
        val b = 5
        println("Enter operator either +, -, * or /")
        val operator = readLine()
        val result:String = when (operator) {
            "+" -> "$a + $b = ${a + b}";
            "-" -> "$a - $b = ${a - b}";
            "*" -> "$a * $b = ${a * b}";
            "/" -> "$a / $b = ${a / b}";
            else -> "$operator is invalid";
        }
        println(result);
    }
}