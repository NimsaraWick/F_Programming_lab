def toUpper(word: String): String = {
    val array = word.toCharArray()
    for (i <- 0 until array.length) {
        if (array(i) >= 'a' && array(i) <= 'z') {
            array(i) = (array(i) - 32).toChar
        }
    }
    new String(array)
}
def toLower(word: String): String = {
    val array = word.toCharArray()
    for (i <- 0 until array.length) {
        if (array(i) >= 'A' && array(i) <= 'Z') {
            array(i) = (array(i) + 32).toChar
        }
    }
    new String(array)
}

def main(args: Array[String]): Unit = {
    var name1="Benny";
    var name2="Nirosh";
    var name3="Saman";
    var name4="Kumara";

    println(formatnames(name1,1));
    println(formatnames(name2,2));
    println(formatnames(name3,3));
    println(formatnames(name4,4));
    
}

def formatnames(x: String, y: Int): String = {
  y match {
    case 1 => toUpper(x);
    case 2 => toUpper(x.substring(0, 2)) + x.substring(2);
    case 3 => toLower(x) ;
    case 4 => toUpper(x.head.toString) + x.substring(1, x.length - 1) + toUpper(x.last.toString);
    case _ => x;
}
}