package variable_declare


fun main() {
    var b: Boolean = true;
    var c: Char = 'c';
    var bt : Byte = 5;
    var s: Short = 1;
    var i: Int = 10;
    var l: Long = 123;
    var f: Float = 10.0f;
    var d: Double = 2.32;
    var str: String = "Name";
    val arr: IntArray = IntArray(5);
    arr.forEach { println(it) }
    if(bt is Byte){println("It is a byte instance.");}
}

class VariablesDeclare {

}