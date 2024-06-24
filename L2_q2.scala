def main(args: Array[String]): Unit = {
    var a = 2;
    var b = 3;
    var c = 4;
    var d = 5;
    var k = 4.3f;
    b-=1;
    printf(s"a) --b * a + c *d-- : ${b * a + c *d}\n");
    d-=1;;

    printf(s"b) a++ : $a\n");
    a+=1;

    printf(s"c) -2 * (a - k) + c : ${-2 * (a - k) + c}\n");

    printf(s"d) c = c++ : $c\n");
    c+=1;

    c+=1;
    c= + c * a;
    printf(s"e) c = ++c * a++ : $c\n");
    a+=1;
}