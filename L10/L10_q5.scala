def countLetterOccurrences(words: List[String]): Int = {

    val lengths: List[Int] = words.map(_.length);
    val letter_count: Int = lengths.reduce(_ + _);

    letter_count;
}

def main(args: Array[String]): Unit = {

    // println("Enter the words using space ");
    // val string = scala.io.StdIn.readLine;
    // val words = string.split(" ").toList;
    
    println("List( apple , banana , cherry  , date )");
    val words = List("apple", "banana", "cherry", "date");
    val totalCount = countLetterOccurrences(words);
    println(s"Total count of letter occurrences: $totalCount");
}

