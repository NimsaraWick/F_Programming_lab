
val toUpper = (word: String) => {
    val array = word.toCharArray()
    for (i <- 0 until array.length) {
        if (array(i) >= 'a' && array(i) <= 'z') {
            array(i) = (array(i) - 32).toChar
        }
    }
    val new_word = array.mkString;
    // val new_word = word.toUpperCase();
    new_word; 
}:String;
val toLower = (word: String) => {
    val array = word.toCharArray()
    for (i <- 0 until array.length) {
        if (array(i) >= 'A' && array(i) <= 'Z') {
            array(i) = (array(i) + 32).toChar;
        }
    }
    val new_word = array.mkString;
    // val new_word = word.toLowerCase();
    new_word;
}:String;

val formatnames = (x: String, y: Int) => {
  y match {
    case 1 => toUpper(x);
    case 2 => toUpper(x.substring(0, 2)) + x.substring(2);
    case 3 => toLower(x) ;
    case 4 => toUpper(x.head.toString) + x.substring(1, x.length - 1) + toUpper(x.last.toString);
    case _ => x;
}
}:String;

def main(args: Array[String]): Unit = {
    var name1="Benny";
    var name2="Niroshan";
    var name3="Saman";
    var name4="Kumara";

    println(formatnames(name1,1));
    println(formatnames(name2,2));
    println(formatnames(name3,3));
    println(formatnames(name4,4));
}

