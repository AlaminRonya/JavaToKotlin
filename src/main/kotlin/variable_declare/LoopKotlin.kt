package variable_declare

fun main() {
    for (i in 0..10) {
        println(i)
    }
    for (i in 0..10 step 2) {
        println(i)
    }
    for (i in 10 downTo 0 step 2) {
        println(i)
    }

    var x:Int = 10;
    while (x > 0) {
        if (x==6){
            x--;
            //break
            continue
        }
        println(x);
        x--;
    }


    var m: Int = 10;
    var n: Int = 0;
    try {
        var t = m/n;
    } catch (e: ArithmeticException) {
        // handler
    } finally {
        // optional finally block
    }




}


