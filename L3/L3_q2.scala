def new_list(list: List[String]): List[String] = {
    return list.filter(_.length > 5)
}

def main(args: Array[String]): Unit = {
    printf("Enter the list separated using a space : ");
    val string = scala.io.StdIn.readLine();
    val list = string.split(" ").toList;
    val temp = new_list(list);
    println(s"New List : $temp");
}
