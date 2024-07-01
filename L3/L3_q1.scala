def reversed_string(string:String):String={
    if(string.isEmpty){return "";} 
    else
      return reversed_string(string.tail) + string.head;
}

def main(args: Array[String]): Unit = {
    printf("Enter a string : ");
    val string = scala.io.StdIn.readLine();
    printf(s"Reverse of the string \"$string\" is \"${reversed_string(string)}\"");
    
}